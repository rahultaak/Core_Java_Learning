package Oops_Concept.Constructor;

public class BankAccountcall {
    public static void main(String[] args) {
        BankAccount b1=new BankAccount();
        BankAccount b2 = new BankAccount("ICICI ",966);
        b2.printdetail();
    }
}
