package Oops_Concept.Encapsulation;

import java.security.PrivateKey;

public class loginfacebook {

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

private void rahul(){
    System.out.println("I am private");
}



    private String username;
    private String password;

    public loginfacebook(String password, String username) {
        this.password = password;
        this.username = username;
    }


    boolean isLoggedIn(String username, String password) {


        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
            System.out.println("Logged IN!!");
            return true;
        } else {
            System.out.println("Wrong");
            return false;


        }
    }
}



