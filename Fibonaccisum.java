package Functions;

import java.util.Scanner;

public class Fibonaccisum {
    public static int fibonacciSum(int num) {
        int a = 0, b = 1;
        int sum = 0;
        for (int i = 0; i < num; i++) {
            sum += a;
            int nextTerm = a + b;
            a = b;
            b = nextTerm;

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input for number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int terms = input.nextInt();

        // Generating and printing Fibonacci series
        System.out.println("The sum of the first " + terms + " terms of Fibonacci series is: " + fibonacciSum(terms));
    }
}
