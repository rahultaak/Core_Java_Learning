package Conditions;

import java.util.Scanner;

public class day_number {
    public static void main(String[] args) {

        System.out.println("enter day number and see the day name");
        Scanner sc = new Scanner(System.in);
        int day_number = sc.nextInt();
        switch (day_number){

            case(1):
                System.out.println("monday");
                break;
            case(2):
                System.out.println("Tuesday");
                break;
            case(3):
                System.out.println("wednesday");
                break;
            case(4):
                System.out.println("Thursday");
                break;
            case(5):
                System.out.println("Friday");
                break;
            case(6):
                System.out.println("Saturday");
                break;
            case(7):
                System.out.println("Sunday");
                break;

            default:
                System.out.println("enter valid number");


        }
    }
}
