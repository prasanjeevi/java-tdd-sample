package com.company.samples;

public class LeapYear {
    public static boolean isLeap(int year) {
        return isDivisible(year, 4) && !isDivisible(year, 100);
    }

    private static boolean isDivisible(int year, int denominator) {
        return year % denominator == 0;
    }
}
