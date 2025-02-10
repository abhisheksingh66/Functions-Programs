package Functions;

import java.util.Scanner;

public class LCM {
    public static int lcm(int num1, int num2) {

        int i = 1;

        while (true) {
            int factor = num1 * i;
            if (factor % num2 == 0) {
                return factor;
            }

            i++;
        }

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + lcm(num1, num2));
    }
}
