package com.hackerrank.datastructure;

/**
 * Insert a Node at the head of the Linked List.
 * @author Rushikesh Paradkar
 */
public class LinkedList_InsertNodeAtHead {
    Node Insert(Node head,int x) {
        Node root = head;
        if (root == null) {
            Node newNode = new Node();
            newNode.data = x;
            newNode.next = null;
            head = newNode;
            return head;
        }
        else {
            Node newNode = new Node();
            newNode.data = x;
            newNode.next = root;
            head = newNode;
            return head;
        }
    }
}
