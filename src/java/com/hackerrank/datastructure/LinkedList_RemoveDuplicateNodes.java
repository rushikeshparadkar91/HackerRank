package com.hackerrank.datastructure;

/**
 * Remove duplicate Nodes from a Linked List.
 * @author Rushikesh Paradkar
 */
public class LinkedList_RemoveDuplicateNodes {

    Node RemoveDuplicates(Node head) {
        if (head == null) {
            return null;
        }
        Node current = head;
        while(current.next != null) {
            if (current.data == current.next.data) {
                current.next = current.next.next;
            }
            else {
                current = current.next;
            }
        }
        return head;
    }
}
