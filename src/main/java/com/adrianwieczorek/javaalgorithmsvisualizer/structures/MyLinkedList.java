package com.adrianwieczorek.javaalgorithmsvisualizer.structures;


import com.adrianwieczorek.javaalgorithmsvisualizer.core.Node;

public class MyLinkedList {

    private Node head;
    private int size;

    public MyLinkedList() {
        head = null;
        size = 0;
    }

    public void addLast(Object o) {
        Node node = new Node(o);
        if (head == null) {
            head = node;
        } else {
            Node temp;
            temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = node;
        }
        size++;
    }
    public Object getItem(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();

        Node node = head;
        for (int i = 0;  i < index; i++){
            node = node.next;
        }
        return node.value;
    }
    public void add(int index, Object value) throws IndexOutOfBoundsException {
        if (index < 0 || index > size) throw new IndexOutOfBoundsException();
        Node node = new Node(value);
        if (head == null || index == 0) {
            node.next = head;
            head = node;
        } else {
            Node temp;
            temp = head;
            for (int i = 0;  i < index - 1; i++){
                temp = temp.next;
            }
            node.next = temp.next;
            temp.next = node;
        }
        size++;
    }
    public void remove(int index) throws IndexOutOfBoundsException {
        if (index < 0 || index >= size) throw new IndexOutOfBoundsException();
        if (index == 0) {
            head = head.next;
        }else{
            Node node = head;
            Node temp;
            for (int i = 0; i < index - 1; i++) {
                node = node.next;
            }
            temp = node.next;
            node.next = temp.next;
        }
        size--;
    }

    public void reverse() {
        Node prev = null;
        Node curr = head;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }
}
