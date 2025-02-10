package Functions;

import java.util.Scanner;

public class PalindromeNumber {
    public static boolean isPalindrome(int num) {
        int originalNum = num;
        int reversed = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            reversed = reversed * 10 + lastDigit;
            num /= 10;

        }
        return originalNum == reversed;

    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to check if it's a palindrome: ");
        int number = input.nextInt();

        if (isPalindrome(number)) {
            System.out.println(number + " is a Palindrome number.");
        } else {
            System.out.println(number + " is NOT a Palindrome number.");
        }
    }
}
