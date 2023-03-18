package com.example.java17.records.example2;

import com.example.java17.records.example1.Product;

public class RecordExample2 {

    public static void main(String[] args) {
        var product = new ProductCanonical(1,null, "world");
        System.out.println(product);
        System.out.println(product.name());
        System.out.println(product.description());


        var product2 = new ProductCompact(1,null, "world");
        System.out.println(product2);
        System.out.println(product2.name());
        System.out.println(product2.description());
    }
}
