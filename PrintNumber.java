package com.company.Recursion;

import java.util.Scanner;

public class PrintNumber {

    public static void printNumber(int n) {
        if (n>0) {
            printNumber ( n - 1 );
            System.out.print ( n + " " );
        }
    }

    public static void reversePrintNumber(int n) {
        if (n>0) {
            System.out.print ( n + " " );
            reversePrintNumber ( n - 1 );
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in );
        int num;
        System.out.print ( "Enter a number: " );
        num = scanner.nextInt ();
        printNumber ( num );
        System.out.println (  );
        reversePrintNumber ( num );
    }
}
