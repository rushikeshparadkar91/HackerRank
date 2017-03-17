package com.hackerrank.datastructure;

/**
 * Compare 2 LinkedLists.
 * @author Rushikesh Paradkar
 */
public class LinkedList_Compare2Lists {

    int CompareLists(Node headA, Node headB) {
        // If both the Lists are empty then return 1.
        if (headA == null && headB == null) {
            return 1;
        }
        // If either one of the Lists is empty return 0.
        if (headA == null || headB == null) {
            return 0;
        }
        // Compare the data for each node in the Lists.
        while(headA != null && headB != null) {
            if (headA.data != headB.data) {
                return 0;
            }
            headA = headA.next;
            headB = headB.next;
        }
        // If both of the lists have terminated at this point return 1 indicating identical linked lists.
        if (headA == null && headB == null) {
            return 1;
        }
        // Else Not Identical.
        return 0;
    }
}
