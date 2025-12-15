package revise.oops;

public class ObjectCreation {
    static void main(String[] args) {
        User u1 = new User();
        u1.name = "irfan";
        u1.age = 22;
        u1.printUserDetails();

        User u2 = new User();
        u2.name = "akash";
        u2.age = 21;
        u2.printUserDetails();

        Products p1 = new Products();
        p1.id = 1;
        p1.price = 120.20;
        p1.name = "watch";
        Products p2 = p1;
        p2.name = "cell";
        System.out.println("price : " + p1.name);




    }
}
