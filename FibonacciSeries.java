package com.company.Recursion;

import java.util.Scanner;

public class FibonacciSeries {

    public static int fibonacci ( int n ) {
        if (n==0)
            return 0;
        if (n==1)
            return 1;
        return fibonacci ( n - 1 ) + fibonacci ( n - 2 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter a number: " );
        int n = scanner.nextInt ();
        System.out.println ( 0 );
        System.out.println ( 1 );
        System.out.println ( fibonacci ( n ) );
    }
}
