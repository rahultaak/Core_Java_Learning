package Oops_Concept.Constructor;

public class BankAccount {

    String Bankname;
    int accountnumber;
    String IFSC;

    BankAccount() {
        Bankname = "SBI";
        accountnumber = 123;
        IFSC = "SBI123";
        System.out.println("I am Default Constructor");
    }

    BankAccount(String Bankname,int accountnumber){
        this.Bankname = Bankname;
        this.accountnumber = accountnumber;
    }

    void printdetail(){
        System.out.println("Your Bank IS "+ this.Bankname);
        System.out.println("Your account number is "+ this.accountnumber);
    }
}