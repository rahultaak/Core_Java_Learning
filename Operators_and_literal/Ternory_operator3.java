package Operators_and_literal;

public class Ternory_operator3 {
    public static void main(String[] args) {

        int a=50;
        int b=40;
        int c=30;
        int max=(a>b)?((a>c)?a:c):((b>c)?b:c);
        //int max = (a > b) ? ((a > c) ? a : c) : ((b > c) ? b : c);
        System.out.println(max);

    }
}
