package Functions;

import java.util.Scanner;

public class GDC {
    public static int gdc(int a,int b){
        while (b!=0) {
            int temp=b;
            b=a%b;
            a=temp;
            
        }
        return a;
    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Taking two numbers as input
        System.out.print("Enter the first number: ");
        int num1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = input.nextInt();

        System.out.println("The LCM of " + num1 + " and " + num2 + " is: " + gdc(num1, num2));
    }
}
