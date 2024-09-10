package Oops_Concept.Polymorphism;

public class exp2 {

    int a;
        boolean b;

       exp2(){
           this.a =10;
       }

       exp2(int a){
           this.a =a;
           System.out.println("i am param");
       }

       exp2(int a , boolean b){
           this.a = a;
           this.b= b;
       }


}
