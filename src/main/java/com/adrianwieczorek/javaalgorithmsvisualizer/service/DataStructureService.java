package com.adrianwieczorek.javaalgorithmsvisualizer.service;

import com.adrianwieczorek.javaalgorithmsvisualizer.structures.MyArrayList;
import org.springframework.stereotype.Service;

@Service
public class DataStructureService {

    private final MyArrayList myArrayList = new MyArrayList();

    public void addToList(Object val) {
        myArrayList.add(val);
    }

    public void removeFromList(int index) {
        myArrayList.remove(index);
    }

    public String getVisualization() {
        return myArrayList.toMermaidString();
    }
}