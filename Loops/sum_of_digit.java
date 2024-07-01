package Loops;

import java.util.Scanner;

public class sum_of_digit {
    public static void main(String[] args) {
double sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int number = sc.nextInt();
         int i =0;
         while(i<=number){
             sum = sum + i ;
             i++;
         }

        System.out.println("Sum of all number is " + sum);
   }
}




