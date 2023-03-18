package com.example.java17.records.example2;

public class ValidateUtil {

    public static void isStringEmpty(String text, String errorMessage) {
        if (text == null || text.isBlank()) {
            throw new IllegalArgumentException(errorMessage);
        }
    }
}
