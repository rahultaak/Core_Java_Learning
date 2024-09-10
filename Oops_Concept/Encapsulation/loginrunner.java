package Oops_Concept.Encapsulation;

public class loginrunner {
    public static void main(String[] args) {
        loginfacebook log = new loginfacebook("admin", "admin");
        boolean check = log.isLoggedIn("admin","admin");
String u = log.getUsername();
        System.out.println(u);

        
       // log.setUsername("newusername");
        //log.setPassword("dad");

       // log.password = "password";
        boolean check2 = log.isLoggedIn("admin","password");
    }
}
