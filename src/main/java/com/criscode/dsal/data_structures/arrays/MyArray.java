package com.criscode.dsal.data_structures.arrays;

public class MyArray {

    private String [] array;
    private int capacity;
    private int currentLength;

    public MyArray(){
        this.array = new String[1];
        this.capacity = 1;
        this.currentLength = 0;
    }

    public String get(int index) {
        if (index > -1 && index < currentLength) {
            return this.array[index];
        } else {
            return "Index out of bound";
        }
    }

    public void push(String value) {
        if (capacity == currentLength) {
            String [] tempArray = new String[capacity*2];
            for (int i = 0; i < array.length; i++) {
                tempArray[i] = array[i];
            }
            array = tempArray;
            capacity *= 2;
        }
        array[currentLength] = value;
        currentLength++;
    }

    public void replace(int index, String value) {
        if (index > -1 && index < currentLength) {
            this.array[index] = value;
        } else {
            System.out.println("Index out of bound");
        }
    }

    public void pop() {
        if (currentLength > 0) {
            currentLength--;
        }
    }

    public void delete(int index) {
        if (index > -1 && index < currentLength) {
            if (index == currentLength - 1) {
                pop();
            } else {
                for (int i = index; i < currentLength - 1; i++) {
                    array[i] = array[i+1];
                }
                currentLength--;
            }
        } else {
            System.out.println("Index out of bound");
        }
    }

    public String toString() {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < currentLength; i++) {
            builder.append(array[i]);
            builder.append(" ");
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        MyArray myArray = new MyArray();
        myArray.push("Man");
        myArray.push("Tran");
        myArray.push("Cris");
        myArray.push("Ana");

        myArray.replace(1, "Code");

        myArray.delete(3);

        System.out.println("array: " + myArray);
    }

}
