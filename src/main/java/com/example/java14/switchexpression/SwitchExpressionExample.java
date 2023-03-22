package com.example.java14.switchexpression;

import java.time.LocalDate;

public class SwitchExpressionExample {


    public static void main(String[] args) {
        System.out.println(getCustomMonthTextByMonth(LocalDate.now()));
        System.out.println(getCustomMonthTextByMonthNumber(2));
    }

    public static String getCustomMonthTextByMonth(LocalDate localDate) {
        var month = localDate.getMonth();
        return switch (month) {
            case JANUARY, FEBRUARY, MARCH -> {
                System.out.println("Month Text");
                yield "Q1";
            }
            case APRIL, MAY, JUNE -> "Q2";
            case JULY, AUGUST, SEPTEMBER -> "Q3";
            case OCTOBER, NOVEMBER, DECEMBER -> "Q4";
        };
    }

    public static String getCustomMonthTextByMonthNumber(Integer number) {
        String text = switch (number) {
            case 1, 2, 3 -> {
                System.out.println("Month number: ");
                yield "Quarter 1";
            }
            case 4, 5, 6 -> "Quarter 2";
            case 7, 8, 9 -> "Quarter 3";
            case 10, 11, 12 -> "Quarter 4";
            default -> null;
        };
        return text;
    }
}
