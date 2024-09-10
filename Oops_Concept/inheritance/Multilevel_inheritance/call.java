package Oops_Concept.inheritance.Multilevel_inheritance;

public class call {
    public static void main(String[] args) {
        Grandfather g = new Grandfather();
        g.bhk3();

        father f = new father();
        f.bhk2();
        f.bhk3();

        Son s = new Son();
        s.bhk1();
        s.bhk2();
        s.bhk3();
    }
}
