package collectionsFrame;

import java.util.*;

public class setDemo {

    static void main(String[] args) {
        Set<String> userSet = new HashSet<>();
        userSet.add("Eyes");
        userSet.add("Ears");
        userSet.add("Nose");
        userSet.add("hairs");
//        userSet.get   // set are un-Ordered
        System.out.println("==  Body-Parts ==");
        for (String items : userSet){
            System.out.println("* " + items);
        }

    }

}
