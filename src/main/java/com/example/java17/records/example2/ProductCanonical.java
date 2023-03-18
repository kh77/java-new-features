package com.example.java17.records.example2;

public record ProductCanonical(long id, String name, String description) {
    // same parameter and same order then we can ignore in the constructor
    public ProductCanonical(long id, String name, String description) {
       this.id = id;
       this.name = name == null ? "" : name;
       this.description = description == null ? "" : description;
    }
}
