package com.company.Recursion;

import java.util.Scanner;

public class FirstIndexOfElement {

    public static int firstIndex ( int[] array, int length, int target, int i) {
        if (length==0 || i==length)
            return -1;
        if (array[i]==target)
            return i;
        return firstIndex ( array, length - 1, target, i + 1 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int length, target;
        System.out.print ( "Enter the length of array: " );
        length = scanner.nextInt ();
        int[] array = new int[length];
        System.out.print ( "Enter the array elements: " );
        for (int i = 0; i < array.length; i++ )
            array[i] = scanner.nextInt ();
        System.out.print ( "Enter an element: " );
        target = scanner.nextInt ();
        System.out.println ( firstIndex ( array, length, target, 0 ) );
    }
}
