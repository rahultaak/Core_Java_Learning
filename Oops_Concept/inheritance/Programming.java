package Oops_Concept.inheritance;

public class Programming {

    String codingname;
    String authorname;


  Programming(){
      System.out.println("Default constructor");
  }

  Programming(String codingname,String authorname){
      this.codingname = codingname;
      this.authorname=authorname;
      System.out.println("Paramatrized Constructor");

  }

  void printdetail(){

      System.out.println("The language name is "+ this.codingname);
      System.out.println("The Author of language is " + this.authorname);
  }

  void car(){
      System.out.println("I am car");
  }
















}






