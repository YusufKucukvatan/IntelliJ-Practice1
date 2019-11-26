package com.cybertek.utilities;

public class FailPassEquals {
    public static void failPass(String actual, String expected) {
        if (actual.equalsIgnoreCase(expected)) {
            System.out.println("TEST-1 PASS");
        } else {
            System.out.println("TEST-1 FAIL");
            System.out.println("actual = " + actual);
            System.out.println("expected = " + expected);
        }
    }
}
