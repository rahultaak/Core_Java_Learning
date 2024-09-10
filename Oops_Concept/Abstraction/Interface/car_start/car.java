package Oops_Concept.Abstraction.Interface.car_start;

import java.sql.SQLOutput;

public class car implements engine,Break{

    void start(){
        System.out.println("car is starting");
    }


    @Override
    public void engine_start() {
        System.out.println("car is started");

    }

    @Override
    public void Break_applied() {

        System.out.println("break is applied");

    }
}
