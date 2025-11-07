package com.assignments;

import java.util.Scanner;

/*
 Problem:
 You are selling widgets.  each widget costs $0.65.
 You can buy 3 for $1.00.
 Write a method that will calculate the cost for any amount
 of widgets and display the total.
 */
public class calculateWidgetsTotal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of widgets");
        int n = sc.nextInt();
        double total;
        int threeSets = n%3;   // Number of full sets of 3 widgets
        int remainWidgets = n/3;  // Remaining widgets not part of a full set

        // Calculate total cost:
        // Each set of 3 costs $1.00
        // Each remaining widget costs $0.65
        total= remainWidgets*1.00+threeSets*0.65;
        System.out.println("Total Cost of widgets"+total);
        sc.close();

    }

}
