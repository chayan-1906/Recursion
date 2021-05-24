package com.company.Recursion;

import java.util.Scanner;

public class SumOfDigits {

    public static int sumOfDigits(int num) {
        if (num==0)
            return 0;
        return ( num % 10 ) + sumOfDigits ( num / 10 );
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int num;
        System.out.print ( "Enter a number: " );
        num = scanner.nextInt ();
        System.out.println ( sumOfDigits ( num ) );
    }
}
