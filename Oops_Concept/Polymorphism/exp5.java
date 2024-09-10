package Oops_Concept.Polymorphism;

public class exp5 {

    int a;
    boolean b;

    exp5(){
        this.a = 20;
        System.out.println("I am Dc");
    }


    exp5(int a){
        this.a = a;
        System.out.println("I am Pc");
    }

    exp5(int a,boolean b){
        this.a = a;
        this.b=b;
        System.out.println("I am Pc2");
    }

}






