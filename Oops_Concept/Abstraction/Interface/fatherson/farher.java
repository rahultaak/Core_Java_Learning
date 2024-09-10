package Oops_Concept.Abstraction.Interface.fatherson;

public interface farher {

    void bhk1();

    default void print(){
        System.out.println("i am default method");

    }

    static void print2(){

        System.out.println("i am static method");
    }
}
