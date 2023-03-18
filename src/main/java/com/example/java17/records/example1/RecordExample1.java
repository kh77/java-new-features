package com.example.java17.records.example1;

public class RecordExample1 {

    public static void main(String[] args) {
        var product = new Product(1,"hello", "world");
        System.out.println(product);
        System.out.println(product.name());
        System.out.println(product.description());
    }
}
