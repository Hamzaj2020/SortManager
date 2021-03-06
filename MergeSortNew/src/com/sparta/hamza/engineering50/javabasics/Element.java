package com.sparta.hamza.engineering50.javabasics;

public class Element {

    private Element leftChild;
    private Element rightChild;
    private Element parent;
    private int value;
    private static int nodeCounter;

    public static int getNodeCounter() {
        return nodeCounter;
    }

    public Element getLeftChild() {
        return leftChild;
    }

    public void setLeftChild(int value) {
        this.leftChild = new Element(this, value);
    }

    public Element getRightChild() {
        return rightChild;
    }

    public void setRightChild(int value) {
        this.rightChild = new Element(this, value);
    }

    public static Element getChildlessNode(Element element, int value) {
        if (element.getLeftChild() == null && element.getValue() >= value) {
            return element;
        } else if (element.getRightChild() == null && element.getValue() < value) {
            return element;

        } else if (element.getValue() >= value) {
            element = Element.getChildlessNode(element.getLeftChild(), value);
        } else if (element.getValue() < value) {
            element = Element.getChildlessNode(element.getRightChild(), value);
        }
        return element;
    }

    public Element getParent() {
        return parent;
    }

    public int getValue() {
        return value;
    }

    public Element(Element parent, int value) {
        this.parent = parent;
        this.value = value;
        nodeCounter++;

    }

}

