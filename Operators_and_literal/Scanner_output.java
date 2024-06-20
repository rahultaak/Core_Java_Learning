package Operators_and_literal;

import java.util.Scanner;

public class Scanner_output {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the name");
        String name= sc.next();
        System.out.println("Enter the age");
        int age = sc.nextInt();
        System.out.println("Enter the salary");
        Double salary = sc.nextDouble();

        System.out.println("Your  name is " + name);
        System.out.println("your age  is " + age);
        System.out.println("your salary is " + salary);
    }
}
