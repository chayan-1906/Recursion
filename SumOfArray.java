package com.company.Recursion;

import java.util.Scanner;

public class SumOfArray {

    public static int sum ( int[] array, int length ) {
        if (length==0 || length==1)
            return array[length-1];
        return array[length-1] + sum ( array, length - 1 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int length;
        System.out.print ( "Enter the length of array: " );
        length = scanner.nextInt ();
        int[] array = new int[length];
        for (int i = 0; i < array.length; i++ )
            array[i] = scanner.nextInt ();
        System.out.println ( sum ( array, length ) );
    }
}
