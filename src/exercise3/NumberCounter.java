package exercise3;

import java.util.Scanner;

public class NumberCounter {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int positiveCount = 0;
        int negativeCount = 0;
        double sum = 0;

        int a = input.nextInt();
        while(a != 0){
          if(a > 0){
          positiveCount++;
          }else{
          negativeCount++;

          }
          
          sum = sum + a;
          a = input.nextInt();
        }
        System.out.println("Positive numbers: " + positiveCount);
        System.out.println("Negative numbers: " + negativeCount);
        System.out.println("Sum: " + sum);

        double average = sum / (positiveCount + negativeCount);
        System.out.println("Average:" + average);
    }

}
