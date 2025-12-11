package com.adrianwieczorek.javaalgorithmsvisualizer.structures;

public class MyQueue {
    MyLinkedList myLinkedList =  new MyLinkedList();

    public void enqueue(Object item){
        myLinkedList.addLast(item);
    }
    public void dequeue(){
        myLinkedList.remove(0);
    }
    public Object peek(){
        return myLinkedList.getItem(0);
    }
    public boolean isEmpty(){
        return myLinkedList.isEmpty();
    }
}
