package Conditions;

import java.util.Scanner;

public class check_vowels {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the charater and check it is vowels or not");
        char keyword = sc.next().toCharArray()[0];
            switch (keyword){
                case 'a':
                    System.out.println("This is a vowels");
                    break;
                case 'e':
                    System.out.println("This is a vowels");
                    break;

                case 'i':
                    System.out.println("This is a vowels");
                    break;
                case 'o':
                    System.out.println("This is a vowels");
                    break;
                case 'u':
                    System.out.println("This is a vowels");
                    break;

                default:
                    System.out.println("this is consonent it is not a vowels");

            }
    }
}
