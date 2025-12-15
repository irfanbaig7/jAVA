package revise.poly;

public class PolyDemo {
    static void main(String[] args) {
        Payment p;

        p = new UpiPayment();
        p.pay();

        p = new CardPayment();
        p.pay();

        p = new CashPayment();
        p.pay();

    }
}
