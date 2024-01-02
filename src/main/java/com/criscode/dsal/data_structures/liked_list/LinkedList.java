package com.criscode.dsal.data_structures.liked_list;

public class LinkedList {
    private Node head;
    private Node tail;
    private int length;

    public LinkedList(int value) {
        head = new Node(value);
        tail = this.head;
        length = 1;
    }

    public void append(int value) {
        Node newNode = new Node(value);
        tail.next = newNode;
        tail = newNode;
        length++;
    }

    public void prepend(int value) {
        Node newNode = new Node(value);
        newNode.next = this.head;
        this.head = newNode;
        length++;
    }

    public void insert(int index, int value) {
        if (index < 0 || index > length) {
            System.out.println("Index out of bound");
        } else if (index == 0) {
            prepend(value);
        } else if (index == length) {
            append(value);
        } else {
            Node currentNode = this.head;
            for (int i = 0; i < index - 1; i++) {
                currentNode = currentNode.next;
            }
            Node newNode = new Node(value);
            newNode.next = currentNode.next;
            currentNode.next = newNode;
            length++;
        }
    }

    void remove(int index) {
        if (index < 0 || index >= this.length) {
            System.out.println("Index out of bound");
        } else if (index == 0) {
            head = this.head.next;
            length--;
        } else {
            Node currentNode = this.head;
            int i = 0;
            while (i < index - 1) {
                currentNode = currentNode.next;
                i++;
            }
            currentNode.next = currentNode.next.next;
            length--;
            if (i == length - 1) {
                this.tail = currentNode;
            }
        }
    }

    public void reverse() {
        Node first = this.head;
        this.tail = first;
        Node second = first.next;
        for (int i = 0; i < this.length - 1; i++) {
            Node temp = second.next;
            second.next = first;
            first = second;
            second = temp;
        }
        this.head.next = null;
        this.head = first;
    }

    public int[] printList() {
        int[] myList = new int[length];
        Node currentNode = this.head;
        int i = 0;
        while (currentNode != null) {
            myList[i] = currentNode.value;
            currentNode = currentNode.next;
            i++;
        }
        return myList;
    }
}
