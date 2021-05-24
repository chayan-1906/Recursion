package com.company.Recursion;

import java.util.Scanner;

public class GeometricSum {

    public static double geometricSum ( int num ) {
        if (num==0)
            return 1;
        return 1/Math.pow ( 2, num ) + geometricSum ( num - 1 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int num;
        System.out.print ( "Enter a number: " );
        num = scanner.nextInt ();
        System.out.println ( geometricSum ( num ) );
    }
}
