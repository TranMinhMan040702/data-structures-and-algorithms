package com.criscode.dsal.data_structures.stacks.stack_using_arrays;

public class Stack {
    private String[] array;
    private int capacity;
    private int currentLength;

    public Stack() {
        this.array = new String[1];
        this.capacity = 1;
        this.currentLength = 0;
    }

    public void push(String value) {
        if (capacity == currentLength) {
            String[] tempArray = new String[capacity * 2];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
            capacity *= 2;
        }
        array[currentLength] = value;
        currentLength++;
    }

    public void pop() {
        if (currentLength > 0) {
            currentLength--;
        }
    }

    public String peek() {
        if (currentLength > 0) {
            return array[currentLength - 1];
        } else {
            return null;
        }
    }
}
