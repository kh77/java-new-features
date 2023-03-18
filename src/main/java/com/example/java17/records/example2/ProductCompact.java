package com.example.java17.records.example2;

public record ProductCompact(long id, String name, String description) {
    // same parameter and same order then we can ignore in the constructor
    public ProductCompact {
        ValidateUtil.isStringEmpty(name, "Please enter name");
        ValidateUtil.isStringEmpty(description, "Please enter description");
    }
}
