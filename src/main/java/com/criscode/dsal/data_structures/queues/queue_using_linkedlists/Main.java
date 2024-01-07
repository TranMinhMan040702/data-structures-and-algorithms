package com.criscode.dsal.data_structures.queues.queue_using_linkedlists;

public class Main {
    public static void main(String[] args) {
        Queue queue = new Queue();
        queue.enqueue("Ali");
        queue.enqueue("Cris");
        queue.enqueue("Ana");
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        queue.dequeue();
        System.out.println(queue.peek());
    }
}
