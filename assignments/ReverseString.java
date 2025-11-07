package com.assignments;
/*
create a method that will reverse the output of a string.  Example:  user enters
This is a test, this is only a test.
The output should return:
.tset a ylno si siht ,tset a si sihT
 */
import java.util.Scanner;

public class ReverseString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the String");
        String sentence = sc.nextLine();
        StringBuilder stringBuilder = new StringBuilder(sentence);
        System.out.println(stringBuilder.reverse());
    }
}
