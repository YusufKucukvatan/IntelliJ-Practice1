package com.cybertek.utilities;

public class FailPassContains {
    public static void failPass(String actual, String expected) {
        if (actual.toLowerCase().contains(expected.toLowerCase())) {
            System.out.println("PASS");
        } else {
            System.out.println("FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
    }
}
