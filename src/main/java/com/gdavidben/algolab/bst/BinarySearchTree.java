package com.gdavidben.algolab.bst;

public class BinarySearchTree {

    private Node root;

    public void add(final Integer value) {
        root = addNode(root, value);
    }

    private Node addNode(final Node node, final Integer value) {
        if (node == null) {
            return new Node(value);
        } else if (value < node.getValue()) {
            node.setLeft(addNode(node.getLeft(), value));
        } else if (value > node.getValue()) {
            node.setRight(addNode(node.getRight(), value));
        }
        return node;
    }

    public Node find(final Integer value) {
        return findNode(root, value);
    }

    private Node findNode(final Node node, final Integer value) {
        if (node == null) {
            return null;
        } else if (value.equals(node.getValue())) {
            return node;
        } else if (value < node.getValue()) {
            return findNode(node.getLeft(), value);
        } else if (value > node.getValue()) {
            return findNode(node.getRight(), value);
        } else {
            return null;
        }
    }

    public void remove(final Integer value) {
        root = removeNode(root, value);
    }

    private Node removeNode(Node node, final Integer value) {
        if (node == null) {
            return null;
        } else if (node.getValue().equals(value)) {
            if (node.getLeft() == null && node.getRight() == null) {
                return null;
            } else if (node.getLeft() != null && node.getRight() != null) {
                // smallest in the right side
                final Node smallest = findSmallestValue(node.getRight(), value);
                node.setValue(smallest.getValue());
                node.setRight(removeNode(node.getRight(), smallest.getValue()));
            } else if (node.getLeft() == null) {
                return node.getRight();
            } else {
                return node.getLeft();
            }
        } else if (value < node.getValue()) {
            node.setLeft(removeNode(node.getLeft(), value));
        } else {
            node.setRight(removeNode(node.getRight(), value));
        }
        return node;
    }

    private Node findSmallestValue(final Node node, final Integer value) {
        if (node.getLeft() != null) {
            return findSmallestValue(node.getLeft(), value);
        } else {
            return node;
        }
    }

}
