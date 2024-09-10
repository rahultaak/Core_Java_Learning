package Oops_Concept.Polymorphism;

public class exp6 {

    public static void main(String[] args) {
        person05 p2 = new person05();
        person05 p3 = null;
        p3.run();
    }
}



class person05{


    int a;
        void run(){

            System.out.println("run is called");
        }
}
