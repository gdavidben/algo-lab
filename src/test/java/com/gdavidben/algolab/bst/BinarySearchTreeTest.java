package com.gdavidben.algolab.bst;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    private BinarySearchTree bst;

    @BeforeEach
    void setup () {
        bst = new BinarySearchTree();
        bst.add(8);
        bst.add(4);
        bst.add(14);
        bst.add(2);
        bst.add(12);
        bst.add(16);
        bst.add(11);
        bst.add(13);
        bst.add(15);
        bst.add(18);
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
        bst.remove(2);
        assertNull(bst.find(4).getLeft());
    }

    @Test
    void shouldRemoveValue4() {
        bst.remove(4);
        assertEquals(2, bst.find(8).getLeft().getValue());
    }

    @Test
    void shouldRemoveValue14() {
        bst.remove(14);
        assertEquals(15, bst.find(8).getRight().getValue());
    }

    @Test
    void shouldRemoveValue12() {
        bst.remove(12);
        assertEquals(13, bst.find(14).getLeft().getValue());
    }
}
