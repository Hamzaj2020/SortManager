package com.sparta.hamza.engineering50.javabasics;


public interface InterfaceBinary {
    Element getFirstElement();

    int getNumberOfNodes();

    void addNode(int value);

    void addNodes(int[] values);

    boolean findNode(int value);

    Element getLeftChild(Element element);

    Element getRightChild(Element element);

    void createArrayInOrder(Element element);

    int[] getSortedTreeAsc();

    int[] getSortedTreeDesc();
}



