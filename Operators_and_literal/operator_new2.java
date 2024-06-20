package Operators_and_literal;

public class operator_new2 {
    public static void main(String[] args) {

        String name = "hello world";
        String name1 = "hello world";
        System.out.println(name.equals(name1));

        String name2 = new String("hello world");
        System.out.println(name1.equals(name2));
        System.out.println(name1 == name2);

    }
}
