package Conditions;

public class leap_year {


        // Create a program that determines whether a given year is a leap year.
        // A leap year is divisible by 4,


        // but not by 100 unless it is also divisible by 400.
        // Use an if-else statement to make this determination.

        public static void main(String[] args) {

            int year = 1600;
            if((year%4==0 && year % 100!=0) || (year %400 ==0))
            {
                System.out.println("Leap year");

            }
            else {
                System.out.println("not a leap Year");
            }

        }
    }

