package com.hackerrank.datastructure;

/**
 * Reverse a Linked List.
 * @author Rushikesh Paradkar
 */
public class LinkedList_Reverse {
    Node Reverse(Node head) {
        if (head == null) {
            return null;
        }
        Node prev = null;
        Node current = head;
        Node next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        return prev;
    }
}
