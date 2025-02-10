package Functions;

import java.util.Scanner;

public class SumAllOddNum {
    public static int sum(int num) {
        int sum = 0;

        for (int i = 1; i <= num; i++) {
            if (i % 2 != 0) {
                sum += i;
            }

        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the upper limit: ");
        int limit = input.nextInt();

        System.out.println("The sum of all odd numbers up to " + limit + " is: " + sum(limit));
    }
}
