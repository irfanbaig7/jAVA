package revise.inhert;

class User {

    String name;
    String email;
    String role = "User role";

    String address = "gole";
    void login(){
        System.out.println("User login..");
    }

    User(){
        System.out.println("User contructor");
    }
}

