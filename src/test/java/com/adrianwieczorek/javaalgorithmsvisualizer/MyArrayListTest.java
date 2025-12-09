package com.adrianwieczorek.javaalgorithmsvisualizer;

import com.adrianwieczorek.javaalgorithmsvisualizer.structures.MyArrayList;
import org.junit.jupiter.api.Test;

class MyArrayListTest {

    @Test
    void shouldResizeArray() {
        MyArrayList list = new MyArrayList();

        for (int i = 0; i < 5; i++) list.add(i);

        list.add(99);

        System.out.println(list.toMermaidString());
    }
}