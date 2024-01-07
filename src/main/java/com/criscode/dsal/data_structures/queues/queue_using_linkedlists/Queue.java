package com.criscode.dsal.data_structures.queues.queue_using_linkedlists;

public class Queue {
    private Node first;
    private Node last;
    private int length;

    public Queue() {
        this.first = null;
        this.last = null;
        this.length = 0;
    }

    public void enqueue(String value) {
        Node newNode = new Node(value);
        if (length == 0) {
            this.first = newNode;
        } else {
            this.last.next = newNode;
        }
        last = newNode;
        length++;
    }

    public void dequeue() {
        if (length > 0) {
            this.first = this.first.next;
            if (this.length == 1) {
                this.last = null;
            }
            length--;
        }
    }

    public String peek() {
        if (length > 0) {
            return first.value;
        } else {
            return null;
        }
    }

    public String[] printList() {
        String[] myList = new String[length];
        Node currentNode = this.first;
        int i = 0;
        while (currentNode != null) {
            myList[i] = currentNode.value;
            currentNode = currentNode.next;
            i++;
        }
        return myList;
    }
}
