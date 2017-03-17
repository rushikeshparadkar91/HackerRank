package com.hackerrank.crackingthecodingchallenge;

import java.util.*;

/**
 * A left rotation operation on an array of size shifts each of the array's elements unit to the left.
 * @author Rushikesh Paradkar.
 */
public class ArrayLeftRotate
{
    /**
     * Helper method that shifts the provided array of integers with the k number of rotations.
     * @param a The array to be left shifted.
     * @param n The number of elements in the provided array.
     * @param k The number of rotations that need to be performed.
     */
    public static int[] arrayLeftRotation(int[] a, int n, int k) {
        int output[] = new int[n];
        for (int i=0; i<n; i++)
        {
            // Calculate the new index where the element should be placed.
            int newIndex = (i + (n - k)) % n;
            output[newIndex] = a[i];
        }
        return output;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[n];
        for(int a_i=0; a_i < n; a_i++){
            a[a_i] = in.nextInt();
        }

        int[] output = arrayLeftRotation(a, n, k);
        for(int i = 0; i < n; i++)
            System.out.print(output[i] + " ");

        System.out.println();

    }
}
