package Oops_Concept.Accessmodifier.cop;

public class cop {



    public cop(int gun) {
        this.gun = gun;
    }

    public cop() {

    }

   protected void canishoot(){
        System.out.println("Sure you can shoot");
    }

   protected int gun;


}
