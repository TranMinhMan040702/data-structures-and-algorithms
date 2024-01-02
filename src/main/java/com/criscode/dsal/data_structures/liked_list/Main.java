package com.criscode.dsal.data_structures.liked_list;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList(10);
        linkedList.append(15);
        linkedList.append(5);

        //        linkedList.insert(2, 3);
        //
        //        linkedList.remove(3);
        linkedList.reverse();

        System.out.println(Arrays.toString(linkedList.printList()));
    }
}
