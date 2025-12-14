package revise.inhert;

public class Manege extends User{

//    method over-riding hote hai
    void login(){
        super.login();
        System.out.println("Maneger Login..");
    }

//    field's overide nahi hote
    String role = "Maneger role";

    void printRole(){
        System.out.println(super.role);
        System.out.println(role);
    }

    String address = "khul";

    Manege(){
        System.out.println("Maneger Constrcutor");
    }

}
