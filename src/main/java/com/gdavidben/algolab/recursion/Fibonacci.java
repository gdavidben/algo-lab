package com.gdavidben.algolab.recursion;

import java.util.HashMap;
import java.util.Map;

public class Fibonacci {

    private Fibonacci() {
    }

    public static long run(int n) {
        if (n == 0) {
            return n;
        }

        return fibonacci(0, 1, n - 1);
    }

    private static long fibonacci(long prev, long last, int n) {
        if (n < 1) {
            return last;
        }
        return fibonacci(last, prev + last, n - 1);
    }

    static class Cached {

        private Cached() {
        }
        
        private static final Map<Integer, Long> CACHE = new HashMap<>();

        public static long run(int n) {
            return fibonacci(n);
        }

        private static long fibonacci(int n) {
            if (n < 2) {
                return n;
            }

            if (CACHE.containsKey(n)) {
                return CACHE.get(n);
            }

            final long value = fibonacci(n - 1) + fibonacci(n - 2);
            CACHE.put(n, value);

            return value;
        }
    }
}
