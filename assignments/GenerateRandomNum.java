package com.assignments;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/*
 Write a method that will print out a random 4 digit number (from 0 to 9)
 with 4 unique numbers.  For example, none of the numbers should repeat.
  sample output would look like this:  1256, 9046, 0267, etc.
 */
public class GenerateRandomNum {
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> digits = new ArrayList<>(4);
        while(digits.size() <4){
            int next  = random.nextInt(10);
            if(!digits.contains(next)) {
                digits.add(next);
            }
        }
        StringBuilder randNumber = new StringBuilder();
        for(int d :digits) {
            randNumber.append(d);
        }
        System.out.println("Random 4 digit number:" +randNumber);

    }

}
