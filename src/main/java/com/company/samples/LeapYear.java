package com.company.samples;

public class LeapYear {
    public static boolean isLeap(int year) {
        return year % 4 == 0 && !(year % 100 == 0);
    }
}
