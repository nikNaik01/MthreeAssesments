package com.debugging;

public class AverageScores {
    public static void main(String[] args) {
        // Print out t+
        // he average score and highest score
        //        Find the errors in this file:

        int[] scores = {80, 90, 70, 100, 60};
        int total = 0;
        int count = scores.length;

        System.out.println("Calculating average score...");
        for (int score: scores)
            total += score;


        double average = (double) total / count;
        System.out.println("Average score: " + average);


        int highest = scores[0];
        for (int i = 1; i < scores.length; i++) {
            if (scores[i] > highest) {
                highest = scores[i];
            }
        }

        System.out.println("Highest score: " + highest);
    }
}
