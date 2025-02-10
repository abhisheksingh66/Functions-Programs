package Functions;

import java.util.Scanner;

public class ArmStrongNumber {
    public static boolean isArmstrong(int num){
        int originalNum = num;
        int sum = 0;
        int digits=String.valueOf(num).length();

        while (num>0) {
            int lastDigit=num%10;
            sum+=Math.pow(lastDigit, digits);
            num/=10;
            
        }
        return sum==originalNum;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking user input
        System.out.print("Enter a number to check if it's an Armstrong number: ");
        int number = input.nextInt();

        // Checking if the number is Armstrong and displaying result
        if (isArmstrong(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is NOT an Armstrong number.");
        }

    }
}
