package Functions;

import java.util.Scanner;

public class FibonacciSeriesPrint {
    public static void printfibonacci(int num){
        int a=0,b=1;

        for(int i=0;i<num;i++){
            System.out.print(a + " ");
            int nextTerm=a+b;
            a=b;
            b=nextTerm;

        }

    }
    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

        // Taking input for number of terms in the Fibonacci series
        System.out.print("Enter the number of terms in Fibonacci series: ");
        int terms = input.nextInt();

        // Generating and printing Fibonacci series
        printfibonacci(terms);
    }
}
