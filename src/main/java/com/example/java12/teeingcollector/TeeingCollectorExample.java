package com.example.java12.teeingcollector;


import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.Comparator.comparing;
import static java.util.stream.Collectors.maxBy;
import static java.util.stream.Collectors.minBy;

public class TeeingCollectorExample {

    public static void main(String[] args) throws IOException {

        Path path = Path.of("src/main/resources/dictionary.txt");

        //Solution 1
        System.out.println("\nSolution 1");
        findMinAndMaxByDifferentStream(path);

        //Solution 2 : got exception stream can be operated only once
        // System.out.println("\nSolution 2");
        // findMinAndMaxBySameStream(path);

        //Solution 3
        System.out.println("\nSolution 3");
        teeingCollector(path);
    }

    public static void findMinAndMaxByDifferentStream(Path path) throws IOException {

        try (Stream<String> line = Files.lines(path)) {
            Optional<String> min = line.min(comparing(String::length));
            System.out.println("Smallest word : " + min.orElse("Word not found"));
        }

        try (Stream<String> line = Files.lines(path)) {
            Optional<String> max = line.max(comparing(String::length));
            System.out.println("Longest word : " + max.orElse("Word not found"));
        }
    }

    public static void findMinAndMaxBySameStream(Path path) throws IOException {
        try (Stream<String> line = Files.lines(path)) {

            Optional<String> min = line.min(comparing(String::length));
            Optional<String> max = line.max(comparing(String::length));

            System.out.println("Smallest word : " + min.orElseGet(() -> "Word not found"));
            System.out.println("Longest word : " + max.orElseGet(() -> "Word not found"));
        }
    }


    public static void teeingCollector(Path path) throws IOException {

        try (Stream<String> line = Files.lines(path)) {
            Statistics data = line.collect(
                    Collectors.teeing(minBy(comparing(String::length)), maxBy(comparing(String::length)),
                            (smallWord, longWord) ->
                                    new Statistics(smallWord.orElse(null), longWord.orElse(null))));
            System.out.println(data);
        }
    }

}
