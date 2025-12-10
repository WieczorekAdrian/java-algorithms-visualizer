package com.adrianwieczorek.javaalgorithmsvisualizer.structures;

public class MyStack {
    MyLinkedList myLinkedList = new MyLinkedList();

    public void push(Object o) {
        myLinkedList.add(0,o);
    }
    public void pop(){
        myLinkedList.remove(0);
    }
    public Object peek(){
        return myLinkedList.getItem(0);
    }
}
