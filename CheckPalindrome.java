package com.company.Recursion;

import java.util.Scanner;

public class CheckPalindrome {

    public static boolean isPalindrome ( int[] num, int start, int end ) {
        if (start > end)
            return true;
        if (num[start]==num[end])
            return isPalindrome ( num, start + 1, end - 1 );
        else
            return false;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter the no. of rows: " );
        int rows = scanner.nextInt ();
        int[] matrix = new int[rows];
        System.out.print ( "Enter array elements: " );
        for (int i = 0; i < rows; i++)
            matrix[i] = scanner.nextInt ();
        System.out.println ( isPalindrome ( matrix, 0, matrix.length - 1 ) );
    }
}
