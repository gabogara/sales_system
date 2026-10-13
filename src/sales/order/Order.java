package sales.order;

import sales.product.Product;

public class Order {
    private final int orderId;
    private static final int MAX_PRODUCTS = 10;
    private Product[] products;
    private int counterProducts;
    private static  int counterOrders = 0;

    public Order() {
        this.orderId = ++Order.counterOrders;
        this.products = new Product[Order.MAX_PRODUCTS];
    }

    public void addProduct(Product product) {
        if (counterProducts >= MAX_PRODUCTS) {
            throw new IllegalArgumentException("Cannot add more products. The max number to insert is: " + Order.MAX_PRODUCTS);
        }
        this.products[this.counterProducts++] = product;
    }

    public double getTotalPrice() {
        double totalOrder = 0;
        for(int i = 0; i < this.counterProducts; i++) {
            totalOrder += products[i].getProductPrice();
        }
        return totalOrder;
    }

    public void showOrder() {
        System.out.println("Order ID: " + this.orderId);
        System.out.println("Total Price: " + this.getTotalPrice());
        System.out.println("Total Quantity: " + this.counterProducts);
        System.out.println("\tProduct Details: ");
        for (int i = 0; i < this.counterProducts; i++) {
            System.out.println(products[i]);
        }
    }



}
