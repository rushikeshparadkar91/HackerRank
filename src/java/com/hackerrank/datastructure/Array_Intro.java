package com.hackerrank.datastructure;

import java.util.Scanner;

/**
 * Introduction to Arrays.
 * @author Rushikesh Paradkar.
 */
public class Array_Intro {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            arr[arr_i] = in.nextInt();
        }
    }

}
