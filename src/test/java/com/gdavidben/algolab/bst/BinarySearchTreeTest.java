package com.gdavidben.algolab.bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    private BinarySearchTree mainBst;

    @BeforeEach
    void setup () {
        mainBst = new BinarySearchTree();
        mainBst.add(8);
        mainBst.add(4);
        mainBst.add(14);
        mainBst.add(2);
        mainBst.add(12);
        mainBst.add(16);
        mainBst.add(11);
        mainBst.add(13);
        mainBst.add(15);
        mainBst.add(18);
    }

    @Test
    void shouldAddAndFindTheValue() {
        final BinarySearchTree bst = new BinarySearchTree();
        bst.add(8);

        assertEquals(8, bst.find(8).getValue());
    }

    @Test
    void shouldNotFindTheValue() {
        final BinarySearchTree bst = new BinarySearchTree();
        bst.add(8);

        assertNull(bst.find(4));
    }

    @Test
    void shouldHaveLeftAndRightNode() {
        final BinarySearchTree bst = new BinarySearchTree();
        bst.add(8);
        bst.add(4);
        bst.add(14);

        assertEquals(4, bst.find(8).getLeft().getValue());
        assertEquals(14, bst.find(8).getRight().getValue());
    }

    @Test
    void shouldRemoveValue2() {
        mainBst.remove(2);
        assertNull(mainBst.find(4).getLeft());
    }

    @Test
    void shouldRemoveValue4() {
        mainBst.remove(4);
        assertEquals(2, mainBst.find(8).getLeft().getValue());
    }

    @Test
    void shouldRemoveValue14() {
        mainBst.remove(14);
        assertEquals(15, mainBst.find(8).getRight().getValue());
    }

    @Test
    void shouldRemoveValue12() {
        mainBst.remove(12);
        assertEquals(13, mainBst.find(14).getLeft().getValue());
    }
}
