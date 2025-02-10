package Functions;

import java.util.Scanner;

public class MultiplicationNumber {
public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    System.out.print("Enter a number to calculate its multiplication table: ");
    int number = input.nextInt();

    System.out.print("Multiplication number of table is : " + number);
    System.out.println();

    for(int i=1;i<=10;i++){
        System.out.println(number + " * " + i + " = " +(number*i));

    }
}
}
