package com.example.java17.records.example1;

public record Product(long id, String name, String description) {
    // compiler translate into final class and mark private final fields
    // generates constructor
    // generates access method like : id() name() description() .. it will not make getId() etcc
    // instance fields are not allowed
    // static fields are allowed
    // not for Jpa

    private static int discount = 3;

    // can override method

    public String name() {
        return name != null ? name : "anonymous";
    }
}
