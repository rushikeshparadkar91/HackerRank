package com.hackerrank.crackingthecodingchallenge;

/**
 * Write a solution to find a cycle in a Linked List.
 * @author Rushikesh Paradkar
 */
public class DetectLinkedListCycle {

    /**
     * Method that checks if the Linked List has cycle.
     * @param head The head to start for the Linked List.
     * @return True if the Linked List has a cycle, false otherwise.
     */
    boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node slow = head;
        Node fast = head.next;
        while(fast.next != null) {
            if (slow == fast) {
                return true;
            }
            slow = slow.next;
            fast = fast.next.next;
        }
        return false;
    }

    /**
     * Node Class.
     */
    public class Node {
        int data;
        Node next;
    }
}
