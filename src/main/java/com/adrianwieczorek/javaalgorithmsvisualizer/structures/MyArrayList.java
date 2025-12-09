package com.adrianwieczorek.javaalgorithmsvisualizer.structures;

public class MyArrayList {

    Object[] array;
    int size;

    public MyArrayList() {
        array = new Object[5];
    }

    public void add(Object o) {
        if (size == array.length) {
            Object[] newArray = new Object[array.length * 2];
            System.arraycopy(array, 0, newArray, 0, array.length);
            array = newArray;
        }
        array[size] = o;
        size++;
    }

    public void remove(int index) {
        if (index >= size || index < 0) {
            return;
        }
        System.arraycopy(array,index+1,array,index,size-index-1);
        array[--size] = null;
    }

    public String toMermaidString() {
        StringBuilder sb = new StringBuilder();

        sb.append("graph LR\n");

        sb.append("subgraph RAM\n");

        sb.append("direction TB\n");

        for (int i = 0; i < array.length; i++) {
            String nodeId = "node" + i;
            String val = (array[i] != null) ? array[i].toString() : "null";

            sb.append(nodeId).append("[\"idx:").append(i).append(" val:").append(val).append("\"]");

            if (i < size) {
                sb.append(":::zajete");
            } else {
                sb.append(":::puste");
            }

            if (i < array.length - 1) {
                sb.append(" --> ");
            } else {
                sb.append("\n");
            }
        }

        sb.append("end\n");


        sb.append("classDef zajete fill:#f96,stroke:#333,stroke-width:2px\n");
        sb.append("classDef puste fill:#f9f9f9,stroke:#333,stroke-dasharray: 5 5\n");

        return sb.toString();
    }
    }
