package Functions;

import java.util.Scanner;

public class ReverseNumber {
    public static int reverse(int num){
        int rev = 0;
        while (num!=0) {
            int lastDigit = num%10;
            rev = rev*10+lastDigit;
            num/=10;
            
        }
        return rev;

    }
    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number to reverse its digits: ");
        int number = input.nextInt();

        // Reversing the number
        int reversedNumber = reverse(number);

        // Displaying the reversed number
        System.out.println("The reversed number is: " + reversedNumber);
    }
}
