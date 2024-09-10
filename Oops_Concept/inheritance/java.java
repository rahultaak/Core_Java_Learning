package Oops_Concept.inheritance;

public class java extends Programming{

    String newfeature;
     java (){
         System.out.println("Java constructor");

     }

     void Java (String Feature){
         this.newfeature = Feature;

     }

     void printdetail1(){
         System.out.println("Feature is "+ this.newfeature);
     }


}
