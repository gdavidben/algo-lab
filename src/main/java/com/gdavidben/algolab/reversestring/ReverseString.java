package com.gdavidben.algolab.reversestring;

public class ReverseString {

    private ReverseString() {
    }

    static String reserve(final String str) {
        if (str == null) {
            throw new IllegalArgumentException("Invalid parameter");
        }

        StringBuilder result = new StringBuilder();

        for (int i = str.length() - 1; i >= 0; i--) {
            result.append(str.charAt(i));
        }

        return result.toString();
    }

    static String modernReverse(final String str) {
        return new StringBuilder(str).reverse().toString();
    }
}
