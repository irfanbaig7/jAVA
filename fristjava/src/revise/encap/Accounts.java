package revise.encap;

import java.sql.SQLOutput;

public class Accounts {
    static void main(String[] args) {

        BankAcc acc1 = new BankAcc();
//        not safe
//        acc1.bal = 1500;
//        acc1.bal = 2000000;
//        System.out.println(acc1.bal);

//        safe
        acc1.depo(1000);
        acc1.depo(1000);
        acc1.withd(1500);
        System.out.println(acc1.getBal());
//        acc1.getBal();
        acc1.setAge(-10);
        System.out.println(acc1.getAge());




    }
}
