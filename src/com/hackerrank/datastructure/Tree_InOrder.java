package com.hackerrank.datastructure;

/**
 * In Onrder Traversal of Tree.
 * @author Rushikesh Paradkar
 */
public class Tree_InOrder {
    class Node {
        int data;
        Node left;
        Node right;
    }


    void inOrder(Node root) {
        if (root == null) {
            return;
        }
        inOrder(root.left);
        System.out.print(root.data+" ");
        inOrder(root.right);
    }
}
