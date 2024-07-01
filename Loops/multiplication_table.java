package Loops;

import java.util.Scanner;

public class multiplication_table {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number");
        int i = input.nextInt();
        for(int j=1;j<=10;j++){
            System.out.println(i + "*" +  j + "=" +  i*j);
        }
    }
}
