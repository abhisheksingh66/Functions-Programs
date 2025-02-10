package Functions;

import java.util.Scanner;

public class PrimeNumber {
    public static boolean isPrimeNum(int num){
        if (num <= 1) {
            return false;  // Numbers less than or equal to 1 are not prime
        }

        for(int i=2;i<num;i++){
            if (num%i==0) {
                return false;
                
            }

        }
        return true;

    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter a number to check if it's prime: ");
        int number = input.nextInt();

        // Checking if the number is prime
        if (isPrimeNum(number)) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
    }
}
