package com.hackerrank.datastructure;

/**
 * Deletes a Node at a specified position.
 * @author Rushikesh Paradkar
 */
public class LinkedList_DeleteANode {
    Node Delete(Node head, int position) {
        Node root = head;
        if (root == null) {
            return null;
        }
        if (position == 0) {
            head = head.next;
            return head;
        }
        int k = 0;
        while (root.next != null && k < position -1) {
            root = root.next;
            k++;
        }
        Node next = root.next;
        root.next = next.next;
        return head;
    }
}
