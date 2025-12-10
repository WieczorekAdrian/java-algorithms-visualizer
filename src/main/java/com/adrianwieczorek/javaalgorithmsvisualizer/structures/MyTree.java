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
            if(value < current.value) {
                if (current.left == null) {
                    MyBst newLeftNode = new MyBst();
                    newLeftNode.value = value;
                    current.left = newLeftNode;
                    return;
                }else  {
                    current = current.left;
                }
            }
            else {
                    if(current.right == null){
                        MyBst newRightNode = new MyBst();
                        newRightNode.value = value;
                        current.right = newRightNode;
                        return;
                    }
                    else{
                        current = current.right;
                    }
                }
            }
        }
    }

