package com.company.Recursion;

import java.util.Scanner;

public class Power {

    public static int power ( int base, int exp ) {
        if (exp==0)
            return 1;
        return base * power ( base, exp - 1 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        System.out.print ( "Enter the base & exponent: " );
        int base = scanner.nextInt ();
        int exp = scanner.nextInt ();
        System.out.println ( power ( base, exp ) );
    }
}
