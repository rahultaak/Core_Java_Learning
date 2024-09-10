package Oops_Concept.Polymorphism.method_overriding;

public class runner {

    public static void main(String[] args) {
        dog d = new dog();
        d.bark();

        dog d1 = new hound();
        d1.bark();
    }
}
