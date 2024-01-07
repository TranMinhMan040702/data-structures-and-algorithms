package com.criscode.dsal.data_structures.queues.queue_using_stack;

import java.util.Stack;

public class Queue {
    Stack<String> queueStack = new Stack<>();
    Stack<String> revStack = new Stack<>();

    public void push(String value) {
        if (this.queueStack.isEmpty()) {
            this.queueStack.push(value);
        } else {
            while (!this.queueStack.isEmpty()) {
                this.revStack.push(this.queueStack.pop());
            }
            this.revStack.push(value);
            while (!this.revStack.isEmpty()) {
                this.queueStack.push(this.revStack.pop());
            }
        }
    }

    public String pop() {
        if (!this.queueStack.isEmpty()) {
            return this.queueStack.pop();
        } else {
            return null;
        }
    }

    public String peek() {
        if (!this.queueStack.isEmpty()) {
            return this.queueStack.get(this.queueStack.size() - 1);
        } else {
            return null;
        }
    }
}
