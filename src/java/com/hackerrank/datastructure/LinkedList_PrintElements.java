package com.hackerrank.datastructure;

/**
 * Print the elements in the Linked List.
 * @author Rushikesh Paradkar
 */
public class LinkedList_PrintElements {

    void Print(Node head) {
        if(head == null) return;
        Node node = head;
        while(true) {
            System.out.println(node.data + " ");
            if (node.next != null){
                node = node.next;
            }
            else {
                break;
            }

        }
    }
}
