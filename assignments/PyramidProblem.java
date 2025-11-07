package com.assignments;

import java.util.Scanner;

/*
Problem:
Create a pyramid of numbers:
write a method that will prompt the user for a number (for example, 5)
 The method should create output that looks like this:
    1
   2 2
  3 3 3
 4 4 4 4
5 5 5 5 5
 */
public class PyramidProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();
        for(int i=1;i<=n;i++) {
            for(int j=1;j<=n-i;j++) {
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++) {
                System.out.print(i);
            }
            // Move to the next line after finishing a row
            System.out.println();
        }

    }
}
