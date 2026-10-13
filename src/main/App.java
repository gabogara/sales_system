package main;

import sales.order.Order;
import sales.product.Product;

public class App {
    static void main() {
        Order order = new Order();
        Product product1 = new Product("Shirt", 30.00);
        Product product2 = new Product("Shoes", 50.00);
        Product product3 = new Product("Coat", 4.00);
        Product product4 = new Product("Jeans", 19.00);
        Product product5 = new Product("Jacket", 28.00);
        Product product6 = new Product("Short", 14.00);
        Product product7 = new Product("Cap", 16.00);
        Product product8 = new Product("Chinese Pants", 22.00);
        Product product9 = new Product("Shirt2", 22.00);
       // Product product10 = new Product("Shirt3", 13.00);

        order.addProduct(product1);
        order.addProduct(product2);
        order.addProduct(product3);
        order.addProduct(product4);
        order.addProduct(product5);
        order.addProduct(product6);
        order.addProduct(product7);
        order.addProduct(product8);
        order.addProduct(product9);
       // order.addProduct(product10);
        System.out.println(order);
        Order order2 = new Order();
        order2.addProduct(product1);
        order2.addProduct(product2);
        System.out.println(order2);

    }
}
