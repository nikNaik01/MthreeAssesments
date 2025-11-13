package MandCodeAssignment;

import java.io.PrintStream;
import java.util.Scanner;

public class Factorial {
    PrintStream printStream = System.out;

    public static void main(String[] args) {
        Factorial factorialProgram = new Factorial();
        factorialProgram.solution();
    }

    private void solution() {
        boolean isInputValid = true;
        int num = 0;
        Scanner sc = new Scanner(System.in);
        this.printStream.print("Enter number");
        do {
            num = sc.nextInt();
            num = isInputNumberValid(num);
            if (num == -1) {
                isInputValid = false;
            } else {
                isInputValid = true;
            }
        } while (!isInputValid);

        this.printStream.print(calculateFactorial(num));

    }

    /**
     *
     * @param num
     * @return boolean value true or false
     * The input value must be:
     * An integer
     * Positive
     * Between 1 and 10, inclusive
     */
    private int isInputNumberValid(int num) {
        if(num>0 && num<=10) {
            return num;
        }
       this.printStream.println("Invalid entry. Please enter an integer between 1 and 10, inclusive");

        return -1;
    }

    /**
     * Calculate  factorial of the valid number
     */
    private int calculateFactorial(int num) {
        //YOUR CODE STARTS HERE
        int result = 1;
        for (int i = 1; i <= num; i++) {
            result *= i;
        }
        return result;
    }
}
