package com.criscode.dsal.data_structures.trees.binary_search_tree;

import lombok.Getter;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;
import java.util.Queue;

public class BinarySearchTree {
    @Getter
    private Node root;

    public BinarySearchTree() {
        this.root = null;
    }

    public void insert(int value) {
        Node newNode = new Node(value);
        if (this.root == null) {
            this.root = newNode;
        } else {
            Node currentNode = this.root;
            while (true) {
                if (value < currentNode.value) {
                    // Left
                    if (currentNode.left == null) {
                        currentNode.left = newNode;
                        break;
                    }
                    currentNode = currentNode.left;
                } else {
                    // Right
                    if (currentNode.right == null) {
                        currentNode.right = newNode;
                        break;
                    }
                    currentNode = currentNode.right;
                }
            }
        }
    }

    public boolean lookup(int value) {
        if (this.root == null) {
            return false;
        }
        Node currentNode = this.root;
        while (currentNode != null) {
            if (value < currentNode.value) {
                currentNode = currentNode.left;
            } else if (value > currentNode.value) {
                currentNode = currentNode.right;
            } else {
                return true;
            }
        }
        return false;
    }

    public List<Integer> breadthFirstSearch() {
        Node currentNode = this.root;
        List<Integer> list = new ArrayList<>();
        Queue<Node> queue = new ArrayDeque<>();
        queue.add(currentNode);

        while (!queue.isEmpty()) {
            currentNode = queue.poll();
            list.add(currentNode.value);
            if (currentNode.left != null) {
                queue.add(currentNode.left);
            }
            if (currentNode.right != null) {
                queue.add(currentNode.right);
            }
        }
        return list;
    }

    public List<Integer> breadthFirstSearchRecursive(List<Integer> list, Queue<Node> queue) {
        if (queue.isEmpty()) {
            return list;
        }
        Node currentNode = queue.poll();
        list.add(currentNode.value);
        if (currentNode.left != null) {
            queue.add(currentNode.left);
        }
        if (currentNode.right != null) {
            queue.add(currentNode.right);
        }
        return breadthFirstSearchRecursive(list, queue);
    }

    HelperFunctions hlp = new HelperFunctions();

    public ArrayList<Integer> DFSInOrder() {
        ArrayList<Integer> answer = new ArrayList<>();
        return hlp.traverseInOrder(this.root, answer);
    }

    public ArrayList<Integer> DFSPreOrder() {
        ArrayList<Integer> answer = new ArrayList<>();
        return hlp.traversePreOrder(this.root, answer);
    }

    public ArrayList<Integer> DFSPostOrder() {
        ArrayList<Integer> answer = new ArrayList<>();
        return hlp.traversePostOrder(this.root, answer);
    }

}
