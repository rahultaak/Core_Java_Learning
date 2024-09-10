package Oops_Concept.Constructor;

public class Atbperson {

    String name;
    int age;
    String Coursename;
    Double mobile;

    Atbperson(){
        System.out.println("Default Constructor");
        name= "selenium";
    }


    Atbperson(String name){
        this.name = name;

    }

    Atbperson (String name,int age){
        this.age = age;
        this.name =name;
    }

    void printdetail(){
        System.out.println(this.name);
        System.out.println(this.age);
       // System.out.println(this.age);
    }


}
