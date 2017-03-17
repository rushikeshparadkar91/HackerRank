package com.hackerrank.datastructure;

/**
 * Merge 2 Linked List.
 * @author Rushikesh Paradkar
 */
public class LinkedList_Merge2Lists {
    Node MergeLists(Node a, Node b) {
        if (a == null) {
            return b;
        } else if (b == null) {
            return a;
        }
        if (a.data < b.data) {
            a.next = MergeLists(a.next, b);
            return a;
        } else {
            b.next = MergeLists(a, b.next);
            return b;
        }
    }
}

