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



    public String toString() {
        String result = "Order ID: " + this.orderId + "\n";
        result += "Total Price: " + this.getTotalPrice() + "\n";
        result += "Total Quantity: " + this.counterProducts + "\n";
        result += "\tProduct Details: " + "\n";
        for (int i = 0; i < this.counterProducts; i++) {
            result += "\t\t" + this.products[i] + "\n";
        }
        return result;
    }



}
