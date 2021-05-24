package com.company.Recursion;

import java.util.Scanner;

public class Multiplication {

    public static int multiply ( int num, int multiplier ) {
        if (multiplier==1)
            return num;
        return num + multiply ( num, multiplier - 1 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int num, multiplier;
        System.out.print ( "Enter a number: " );
        num = scanner.nextInt ();
        System.out.print ( "Enter a multiplier: " );
        multiplier = scanner.nextInt ();
        System.out.println ( multiply ( num, multiplier ) );
    }
}
