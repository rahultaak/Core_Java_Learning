package Conditions;

import java.util.Scanner;

public class grade_system {

    // numerical score (e.g., A, B, C, D, or F) based on the following
    // grading scale:
    //
    //A: 90-100
    //B: 80-89
    //C: 70-79
    //D: 60-69
    //F: 0-59

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter the student number");
        int grade = sc.nextInt();
        if (grade >=90 && grade <=100){
            System.out.println("your greade is A");
        }
       else if (grade >=80 && grade <=89){
            System.out.println("your greade is B");
        }
        else if (grade >=70 && grade <=79){
            System.out.println("your greade is C");
        }
        else if (grade >=60 && grade <=69){
            System.out.println("your greade is D");
        }
        else{
            System.out.println("you are fail");
        }


    }


}
