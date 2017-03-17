package com.hackerrank.datastructure;

/**
 * Pre order traversal of a tree.
 * @author Rushikesh Paradkar
 */
public class Tree_PreOrder {

    class Node {
        int data;
        Node left;
        Node right;
    }

    void preOrder(Node root) {
        if (root == null) {
            return;
        }
        System.out.print(root.data + " ");
        preOrder(root.left);
        preOrder(root.right);
    }
}
