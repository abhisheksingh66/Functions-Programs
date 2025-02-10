package Functions;

import java.util.Scanner;

public class ComputeSum {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

        // Taking input for the number
        System.out.print("Enter an integer: ");
        int number = input.nextInt();

        int sum=0;

         // Making sure the number is positive
        number=Math.abs(number);

        while (number!=0) {
            sum+=number%10;
            number/=10;
            
        }
        System.out.println("The sum of the digits is: " + sum);

    }
}
