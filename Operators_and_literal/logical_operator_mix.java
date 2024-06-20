package Operators_and_literal;

public class logical_operator_mix {
    public static void main(String[] args) {


     //||---or operator
        int a=45;
        boolean b = !(a>10 || a<5);
        System.out.println(b);

        //&&--and operator
        int a1=45;
        boolean b1 = (a1>10 && a1<5);
        System.out.println(b1);

        int a2=15;
        boolean b2 = (a2>10 && a2<25);
        System.out.println(b2);



    }
}
