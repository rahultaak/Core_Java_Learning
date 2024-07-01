package Loops;

public class for_loop {

    // Loops
    // -> Do perform a task multiple times
    // -> For, While, Do while,
    // Break and Continue


    // For, While and Do While

    // For Loop ->
    // 1. Use to perform a task multiple times
    // 2. Based on condition -> task multiple times.


    // Repetitive Task
       // System.out.println("Pramod"); // 10 times
    // for( A ;B ; C)
    // A -> Initialization -> JVM What variable, where you are starting point
    // B - Condition -> When you want this to stop.
    // C ->  Increment / Decrement

    // A -> int i = 1
    // B -> i < = 10 ;
    // C -> i++ -> Post increment
    // D -> Which code -> System.out.println("Pramod");

//        for(A;B;C){
//            D
//        }
    // <= -> < =

    public static void main(String[] args) {
        for (int i=1;i<=10;i++){
            if(i==5){
                break;
            }
            System.out.println("I am for loop");
        }
    }
}
