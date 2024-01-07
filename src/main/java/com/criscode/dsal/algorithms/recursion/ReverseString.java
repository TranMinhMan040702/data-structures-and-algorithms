package com.criscode.dsal.algorithms.recursion;

public class ReverseString {

    public String reverseStringRecursive(String str) {
        if (str.equals("")) {
            return "";
        }
        return reverseStringRecursive(str.substring(1)) + str.charAt(0);
    }

    public String reverseStringIterative(String str) {
        StringBuilder builder = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            builder.append(str.charAt(i));
        }
        return builder.toString();
    }

    public static void main(String[] args) {
        String str = "yoyo master";
        ReverseString reverseString = new ReverseString();

        System.out.println(reverseString.reverseStringRecursive(str));
    }

}
