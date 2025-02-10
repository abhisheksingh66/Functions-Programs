package Functions;

import java.util.Scanner;

public class FactorialNumber {

    public static int factorial(int num) {
        long fac = 1;
        if (num < 0) {
            System.out.println("Factorial is not defined for negative number");

        } else {
            for (int i = 1; i < num; i++) {
                fac *= i;
            }
        }
        return (int) fac;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int number = input.nextInt();

        System.out.println("Factorial of " + number + " is " + factorial(number));

    }
}
