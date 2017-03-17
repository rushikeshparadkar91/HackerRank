package com.hackerrank.datastructure;

/**
 * Detect Cycle in Linked List
 * @author Rushikesh Paradkar
 */
public class LinkedList_CycleDetection {
    boolean hasCycle(Node head) {
        if (head == null) {
            return false;
        }
        Node slowPointer = head;
        Node fastPointer = head.next;
        while (true) {
            if (fastPointer.next == null) {
                return false;
            }
            slowPointer = slowPointer.next;
            fastPointer = fastPointer.next.next;
            if (slowPointer == fastPointer) {
                return true;
            }
        }
    }
}
