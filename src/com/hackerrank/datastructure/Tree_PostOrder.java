package com.hackerrank.datastructure;

/**
 * Post Order Traversal of a Tree.
 * @author Rushikesh Paradkar
 */
public class Tree_PostOrder {
    class Node {
        int data;
        Node left;
        Node right;
    }

    void postOrder(Node root) {
        if (root == null) {
            return;
        }
        postOrder(root.left);
        postOrder (root.right);
        System.out.print(root.data+" ");
    }
}
