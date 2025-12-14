package revise.inhert;

public class Main {
    static void main() {
//        Admin details
//        Admin a = new Admin();
//        a.power = "data delete kar sakta huu";
//        a.name = "raju";
//        a.email = "raju@gmail.com";
//        a.login();
//        System.out.println("user details  : " + a.name + ", " + a.email +", "+ a.power);

//        maneger details
        Manege m = new Manege();
        m.name = "maneger ak";
        m.email = "mage@gmail.com";
        m.login(); // Methods = object based
        System.out.println("Address was : " + m.address); // Variables = reference based
        System.out.println("Maneger details  : " + m.name + ", " + m.email + ", role : " );
        m.printRole();

        new Manege();





    }
}
