package com.adrianwieczorek.javaalgorithmsvisualizer.structures;

public class Node {
    // Here we store data
    Object value;
    // Pointer to next node
    Node next;

    public Node(Object value) {
        this.value = value;
        this.next = null;
    }
}