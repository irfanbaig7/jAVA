package collectionsFrame;

import java.util.ArrayList;
import java.util.List;

public class ListDemo {
    static void main(String[] args) {
        List<String> cart = new ArrayList<>();
        cart.add("Shoes");
        cart.add("pant");
        cart.add("phone");
        cart.add("TV");
        System.out.println("Third Element " + cart.get(2));

        System.out.println("== Items ==");
        for (String items : cart){
            System.out.println("* " + items);
        }
    }
}
