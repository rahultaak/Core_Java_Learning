package Conditions;

import java.util.Scanner;

public class expression {


    //  3/ x^2 + y^2 - |z|
    //  A+B-C ->  A ->  x^2 , B -> Y ^2 , C ->  |Z| abs(Z)  -1 ->  1, -199.98 -> +199.98
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("enter the value of -> X");
        Double x = sc.nextDouble();
        System.out.println("enter the value of -> Y");
        Double y = sc.nextDouble();
        System.out.println("enter the value of -> Z");
        Double z = sc.nextDouble();
        Double result;

        result = Math.cbrt(Math.pow(x,2)+Math.pow(y,2)-Math.abs(z));
        System.out.println("the result of expressio " + result);



    }

}
