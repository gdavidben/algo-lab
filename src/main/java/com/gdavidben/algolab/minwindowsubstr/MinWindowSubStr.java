package com.gdavidben.algolab.minwindowsubstr;

public class MinWindowSubStr {

    private MinWindowSubStr() {
    }

    static boolean contains(final String target, final String window) {
        for (Character c : target.toCharArray()) {
            if (!window.contains(String.valueOf(c))) {
                return false;
            }
        }
        return true;
    }

    static String run(final String source, final String target) {
        String minWindowSubStr = null;
        int pl = 0;
        int pr = 1;
        int limit = source.length();

        while (pl <= limit && pr <= limit) {
            final String window = source.substring(pl, pr);

            if (contains(target, window)) {
                if (minWindowSubStr == null || window.length() < minWindowSubStr.length()) {
                    minWindowSubStr = window;
                }
                pl++;
            } else {
                pr++;
            }
        }

        return minWindowSubStr;
    }

}
