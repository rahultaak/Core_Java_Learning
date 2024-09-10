package Oops_Concept.Encapsulation;

public class Banksbi {

    public Banksbi(String name, long bal) {
        this.name = name;
        this.bal = bal;
    }

    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long getBal() {
        return bal;
    }

    public void setBal(long bal) {
        if (bal>1)
        this.bal = bal;
        else {
            System.out.println("Not allowed");
        }
    }

    long bal;


}
