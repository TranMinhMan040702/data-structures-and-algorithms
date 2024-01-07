package com.criscode.dsal.data_structures.stacks.stack_using_linkedlists;

public class Stack {
    private Node top;
    private Node bottom;
    private int length;

    public Stack() {
        this.bottom = null;
        this.top = null;
        length = 0;
    }

    public void push(String value) {
        Node newNode = new Node(value);
        if (length == 0) {
            bottom = newNode;
            top = newNode;
        } else {
            newNode.next = this.top;
            top = newNode;
        }
        this.length++;
    }

    public void pop() {
        if (length > 0) {
            top = this.top.next;
            if (length == 1) {
                bottom = null;
            }
            length--;
        }
    }

    public String peek() {
        if (length > 0) {
            return this.top.value;
        } else {
            return null;
        }
    }

    public String[] printList() {
        String[] myList = new String[length];
        Node currentNode = this.top;
        int i = length - 1;
        while (currentNode != null) {
            myList[i] = currentNode.value;
            currentNode = currentNode.next;
            i--;
        }
        return myList;
    }
}
