package com.gdavidben.algolab.recursion;

public class Factorial {

    private Factorial() {
    }

    static long run(final int n) {
        if (n == 1 || n == 2) {
            return n;
        }

        return factorial(1, n);
    }

    private static long factorial(long value, int n) {
        if (n == 1) {
            return value;
        }
        return factorial(value * n, n - 1);
    }
}
