package com.company.Recursion;

import java.util.Scanner;

public class CountOccurrences_II {

    public static int countOccurrences ( int[] array, int length, int target, int i) {
        if (length==0)
            return 0;
        if (array[i]==target)
            return 1 + countOccurrences ( array, length - 1, target, i + 1 );
        else
            return countOccurrences ( array, length - 1, target, i + 1 );
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
        System.out.println ( countOccurrences ( array, length, target, 0 ) );
    }
}
