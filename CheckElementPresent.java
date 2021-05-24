package com.company.Recursion;

import java.util.Scanner;

public class CheckElementPresent {

    public static boolean isElementPresent ( int[] array, int length, int target) {
        if (length==0)
            return false;
        if (array[length-1]==target)
            return true;
        return isElementPresent ( array, length - 1, target );
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
        System.out.println ( isElementPresent ( array, length, target ) );
    }
}
