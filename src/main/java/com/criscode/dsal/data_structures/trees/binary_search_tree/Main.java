package com.criscode.dsal.data_structures.trees.binary_search_tree;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        BinarySearchTree bst = new BinarySearchTree();
        bst.insert(9);
        bst.insert(4);
        bst.insert(6);
        bst.insert(20);
        bst.insert(170);
        bst.insert(15);
        bst.insert(1);
        bst.insert(3);

        System.out.println(bst.breadthFirstSearch());
        System.out.println(bst.breadthFirstSearchRecursive(
                new ArrayList<>(), new ArrayDeque<>(List.of(bst.getRoot()))));

        System.out.println(bst.DFSInOrder());
        System.out.println(bst.DFSPreOrder());
        System.out.println(bst.DFSPostOrder());
    }
}
