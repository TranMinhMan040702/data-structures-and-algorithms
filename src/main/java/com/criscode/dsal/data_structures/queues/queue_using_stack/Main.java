package com.criscode.dsal.data_structures.queues.queue_using_stack;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.push("Ali");
        queue.push("Cris");
        queue.push("Leo");

        System.out.println(queue.pop());
        System.out.println(queue.peek());
    }
}
