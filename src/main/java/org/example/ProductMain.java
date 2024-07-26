package org.example;

public class ProductMain {
    public static void main(String[] args) {
        Product product = new Product(4.0, 10, "Gallon of gas");
        product.printProduct();
        product.totalCost();
    }
}