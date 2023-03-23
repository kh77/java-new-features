package com.example.java12.teeingcollector;

public class Statistics {

    final private String smallestWord;
    final private String longestWord;

    public Statistics(String smallestWord, String longestWord) {
        this.smallestWord = smallestWord;
        this.longestWord = longestWord;
    }

    @Override
    public String toString() {
        return "Smallest word : " + smallestWord + "\nLongest word : " + longestWord;
    }
}
