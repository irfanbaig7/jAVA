package revise.Abstract;

public class AbstaractDemo {
    static void main(String[] args) {

//        did not create an obj of abstract class ❌
//        Payment p = new Payment();

//      just ref of abstract classes an actual obj creation with subclasses there will be work
//         Payment p = new Upi();

        Upi u = new Upi();
        u.pay();
        u.receipt();

        Cash c = new Cash();
        c.pay();
        c.receipt();

        Payment p = new Upi();
        p.pay();
    }
}
