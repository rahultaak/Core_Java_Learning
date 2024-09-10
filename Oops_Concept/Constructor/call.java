package Oops_Concept.Constructor;

public class call {

    public static void main(String[] args) {


        Person p = new Person();
        p.name = "Rahul";
        p.age=32;
        System.out.println(p.name);
        System.out.println(p.age);

        p.talk();
        p.Sleep();



    }
}
