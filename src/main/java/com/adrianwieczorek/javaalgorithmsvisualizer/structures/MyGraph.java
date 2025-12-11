package com.adrianwieczorek.javaalgorithmsvisualizer.structures;

import com.adrianwieczorek.javaalgorithmsvisualizer.core.Node;

import java.util.LinkedList;

public class MyGraph {
    public MyHashMap map = new MyHashMap();

    public void addVertex(String name) {
        map.put(name, new MyLinkedList());
    }

    public void addEdge(String source, String destination) {
        Object rawList1 = map.get(source);
        MyLinkedList sourceFriends = (MyLinkedList) rawList1;

        sourceFriends.addLast(destination);

        Object rawList2 = map.get(destination);
        MyLinkedList destFriends = (MyLinkedList) rawList2;

        destFriends.addLast(source);
    }


    public String bfs(String source) {
        MyQueue queue = new MyQueue();
        queue.enqueue(source);

        MyHashMap visited = new MyHashMap();
        visited.put(source, "true");

        StringBuilder result = new StringBuilder();

        while (!queue.isEmpty()) {
            Object obj = queue.peek();
            queue.dequeue();
            String currentName = (String) obj;

            result.append(currentName).append(" -> ");

            MyLinkedList currentFriends = (MyLinkedList) map.get(currentName);

            if (currentFriends == null) continue;

            Node temp = currentFriends.head;

            while (temp != null) {
                String neighbor = (String) temp.value;

                if (visited.get(neighbor) == null) {
                    queue.enqueue(neighbor);
                    visited.put(neighbor, "true");
                }

                temp = temp.next;
            }
        }
        return result.toString();
    }
}
