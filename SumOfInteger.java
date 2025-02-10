package Functions;

import java.util.Scanner;

public class SumOfInteger {
    public static void main(String[] args) {
          Scanner input = new Scanner(System.in);

          System.out.print("Enter the upper limit: ");
          int limit = input.nextInt();

          int sum=0;

          for(int i=1;i<limit;i++){
            sum+=i;

          }
          System.out.println("The sum of integers from 1 to " + limit + " is: " + sum);

    }
}
