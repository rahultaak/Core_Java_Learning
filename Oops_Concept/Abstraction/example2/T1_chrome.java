package Oops_Concept.Abstraction.example2;

public class T1_chrome extends baseclass{
    @Override
    String openbrowser() {

        System.out.println("open the chrome browser");
        return "opened";
    }

    @Override
    String closebrower() {
        System.out.println("close the browser");

        return "closed";
    }
}
