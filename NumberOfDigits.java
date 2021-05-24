package com.company.Recursion;

import java.util.Scanner;

public class NumberOfDigits {

    public static int noOfDigits(int num) {
        if (num==0)
            return 0;
        return 1 + noOfDigits ( num / 10 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int num;
        System.out.print ( "Enter a number: " );
        num = scanner.nextInt ();
        System.out.println ( noOfDigits ( num ) );
    }
}
