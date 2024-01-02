package com.criscode.dsal.data_structures.arrays;

public class ReverseString {

    private String reverse(String string) {
        String temp = "";
        for (int i = string.length() - 1; i >= 0; i--) {
            temp += string.charAt(i);
        }
        return temp;
    }

    private String reverse2(String string) {
        StringBuilder builder = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            builder.append(string.charAt(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String string = "Hello Tran Man";
        ReverseString reverseString = new ReverseString();
        System.out.println(reverseString.reverse(string));
        System.out.println(reverseString.reverse2(string));
    }

}
