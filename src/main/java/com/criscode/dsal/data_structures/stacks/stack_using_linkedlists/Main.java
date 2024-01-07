package com.criscode.dsal.data_structures.stacks.stack_using_linkedlists;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        Stack stack = new Stack();
        stack.push("google");
        stack.push("udemy");
        stack.push("discord");
        stack.pop();
        stack.pop();

        System.out.println(stack.peek());
        System.out.println(Arrays.toString(stack.printList()));
    }
}
