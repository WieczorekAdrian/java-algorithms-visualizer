package com.adrianwieczorek.javaalgorithmsvisualizer.core;

public class Node {
    // Here we store data
    public Object value;
    // Pointer to next node
    public Node next;

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }
}