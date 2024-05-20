package com.gdavidben.algolab.minwindowsubstr;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MinWindowSubStrTest {

    @Test
    void test1() {
        assertEquals("t", MinWindowSubStr.run("aaat", "t"));
    }

    @Test
    void test2() {
        assertEquals("zjs", MinWindowSubStr.run("azjskfzts", "sz"));
    }

    // TODO
    @Test
    @Disabled
    void test3() {
        assertEquals("aksfaje", MinWindowSubStr.run("ahffaksfajeeubsne", "jefaa"));
    }
}
