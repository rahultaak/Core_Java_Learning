package Oops_Concept.Abstraction.example2;

public class T2_firefox extends baseclass{
    @Override
    String openbrowser() {
        System.out.println("open the firefox browser");
        return "opened";
    }

    @Override
    String closebrower() {
logs();
        System.out.println("close the firefox browser");
        return "closed";
    }

}
