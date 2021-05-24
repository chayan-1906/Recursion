package com.company.Recursion;

import java.util.Scanner;
import java.util.Stack;

public class StoreAllPositions {

    public static void storeAllPositions (int[] array, int length, int target, int i, Stack<Integer> resultStack) {
        if (length==0) {
            System.out.println ( );
            return;
        }
        if (array[i]==target)
            resultStack.push ( i );
        storeAllPositions ( array, length - 1, target, i + 1, resultStack );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int length, target;
        System.out.print ( "Enter the length of array: " );
        length = scanner.nextInt ();
        int[] array = new int[length];
        Stack<Integer> resultStack = new Stack<> ();
        System.out.print ( "Enter the array elements: " );
        for (int i = 0; i < array.length; i++ )
            array[i] = scanner.nextInt ();
        System.out.print ( "Enter an element: " );
        target = scanner.nextInt ();
        storeAllPositions ( array, length, target, 0, resultStack );
        System.out.println ( resultStack );
    }
}
