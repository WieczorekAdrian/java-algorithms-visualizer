package com.adrianwieczorek.javaalgorithmsvisualizer.structures;

import com.adrianwieczorek.javaalgorithmsvisualizer.core.MyBst;

public class MyTree {

    MyBst root;

    public MyTree() {
        root = null;
    }

    public void insert(int value) {
        if (root == null) {
            root = new MyBst();
            root.value = value;
            return;
        }
        MyBst current;
        current = root;
        while (true) {
            if (value < current.value) {
                if (current.left == null) {
                    MyBst newLeftNode = new MyBst();
                    newLeftNode.value = value;
                    current.left = newLeftNode;
                    return;
                } else {
                    current = current.left;
                }
            } else {
                if (current.right == null) {
                    MyBst newRightNode = new MyBst();
                    newRightNode.value = value;
                    current.right = newRightNode;
                    return;
                } else {
                    current = current.right;
                }
            }
        }
    }

    public boolean contains(int value) {
        if (root == null) return false;
        MyBst current;
        current = root;
        while (true) {
            if (value == current.value) return true;
            if (value < current.value) {
                current = current.left;
            } else {
                current = current.right;
            }
            if (current == null) {
                return false;
            }
        }
    }
    public Integer getMin() {
        if (root == null) return null;
        MyBst current;
        current = root;
        while (current.left != null) {
            current = current.left;
        }
        return current.value;
    }
    public Integer getMax() {
        if (root == null) return null;
        MyBst current;
        current = root;
        while (current.right != null) {
            current = current.right;
        }
        return current.value;
    }

    public String breadthFirstSearch() {
        MyBst current;
        current = root;
        if (root == null) return null;
        StringBuilder sb = new StringBuilder();
        MyQueue queue = new MyQueue();
        queue.enqueue(current);
        while (!queue.isEmpty()) {
            Object raw = queue.peek();
            queue.dequeue();
            MyBst temp = (MyBst) raw;
            sb.append(temp.value).append(" ");
            if (temp.left != null) {
                queue.enqueue(temp.left);
            } if (temp.right != null) {
                queue.enqueue(temp.right);
            }
        }
        return sb.toString();
        }
    }

