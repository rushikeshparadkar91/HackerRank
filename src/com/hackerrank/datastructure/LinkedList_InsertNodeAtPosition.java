package com.hackerrank.datastructure;

/**
 * Inserting an element Node at a specific position.
 * @author Rushikesh Paradkar
 */
public class LinkedList_InsertNodeAtPosition {

    Node InsertNth(Node head, int data, int position) {

        // Creating a reference pointer for head of the list so that head remians intact as it needs to be returned
        // by the function.
        Node root = head;
        Node newNode = new Node();
        newNode.data = data;

        // Condition if the head itself is null - List is empty.
        if (root == null) {
            return newNode;
        }

        // Condition where position to enter is the first node of the linked list.
        if (position == 0) {
            newNode.next = head;
            head = newNode;
            return head;
        }

        // Condition where node needs to be inserted at a specific position (Could be at the end as well).
        int currentPosition = 0;
        while (currentPosition < position - 1 && root.next != null) {
            root = root.next;
            currentPosition++;
        }

        newNode.next = root.next;
        root.next = newNode;
        return head;
    }
}
