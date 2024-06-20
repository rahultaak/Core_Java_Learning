package Conditions;

import java.util.Scanner;

public class if_else3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number a and b");
        int a=sc.nextInt();
        int b=sc.nextInt();
        if(a>b){
            System.out.println("a is maximum");
        }
        else{
            System.out.println("b is maximum");
        }

    }
}
