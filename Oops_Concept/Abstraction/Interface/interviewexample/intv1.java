package Oops_Concept.Abstraction.Interface.interviewexample;

public class intv1 {
    public static void main(String[] args) {

    }
}


interface i1{
    void say();
    default void hello(){
        System.out.println("i am default method");
    }

      class Hello2 implements i1{

        @Override
        public void say() {
            System.out.println("say");
        }

        @Override
        public void hello() {

            System.out.println("hello of hello");

        }
    }
}