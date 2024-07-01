package Loops;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        long fact =1;
        Scanner sc = new  Scanner(System.in);
        System.out.println("Enter the Number");
        int number = sc.nextInt();
        int i = 1;
        while(i<=number){
            fact = fact * i;
            i++;
            }

        System.out.println("Factorial is " + fact);
        }
    }

