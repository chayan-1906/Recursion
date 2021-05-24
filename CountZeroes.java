package com.company.Recursion;

import java.util.Scanner;

public class CountZeroes {

    public static int countZeroes ( int num ) {
        if (num==0)
            return 0;
        int count = countZeroes ( num / 10 );
        if (num % 10 == 0)
            return 1 + count;
        else
            return count;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int num;
        System.out.print ( "Enter a number: " );
        num = scanner.nextInt ();
        System.out.println ( countZeroes ( num ) );
    }
}
