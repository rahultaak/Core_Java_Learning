package Oops_Concept.Encapsulation;

public class icicirunner {
    public static void main(String[] args) {


        Banksbi b = new Banksbi("sbi", 26562);
        b.bal = 51622;
        System.out.println(b.bal);

      String n =  b.getName();
        System.out.println(n);

        b.setName("HDFC");
        String n1 = b.getName();
        System.out.println(n1);


        long l =b.getBal();
        System.out.println(l);

        b.setBal(98);
        long l2 = b.getBal();
        System.out.println(l2);
    }
}
