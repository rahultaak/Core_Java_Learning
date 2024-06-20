package Conditions;

import java.util.Scanner;

public class multiple_condition {

    public static void main(String[] args) {
        System.out.println("enter code");
        int scan_code =005;
        switch (scan_code){
            case 001,002,003:
                System.out.println("this is electronic gadget");
                break;
            case 004,005,006:

                System.out.println("this is machenic gadget");
                break;

            default:
                System.out.println("this is not a product");
        }
    }
}
