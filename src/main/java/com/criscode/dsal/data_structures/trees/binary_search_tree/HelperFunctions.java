package com.criscode.dsal.data_structures.trees.binary_search_tree;

import java.util.ArrayList;

public class HelperFunctions {

    //                  9
    //          4               20
    //       1     6        15      170
    //         3

    // 1 3 4 6 9 15 20 170
    // 9 4 1 3 6 20 15 170
    // 3 1 6 4 15 170 20 9

    public ArrayList<Integer> traverseInOrder(Node node, ArrayList<Integer> array) {
        if (node.left != null) {
            traverseInOrder(node.left, array);
        }
        array.add(node.value);
        if (node.right != null) {
            traverseInOrder(node.right, array);
        }
        return array;
    }

    public ArrayList<Integer> traversePreOrder(Node node, ArrayList<Integer> array) {
        array.add(node.value);
        if (node.left != null) {
            traversePreOrder(node.left, array);
        }
        if (node.right != null) {
            traversePreOrder(node.right, array);
        }
        return array;
    }

    public ArrayList<Integer> traversePostOrder(Node node, ArrayList<Integer> array) {
        if (node.left != null) {
            traversePostOrder(node.left, array);
        }
        if (node.right != null) {
            traversePostOrder(node.right, array);
        }
        array.add(node.value);
        return array;
    }

}
