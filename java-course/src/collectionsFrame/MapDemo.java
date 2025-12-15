package collectionsFrame;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    static void main(String[] args) {
        Map<Integer, String> userMap = new HashMap<>();
        userMap.put(1, "irfan");
        userMap.put(2, "akash");
        userMap.put(3, "vishal");
        userMap.put(4, "rohit");


        System.out.println(" == Map ==" + userMap.get(1));
        for (Map.Entry<Integer, String> entry : userMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }




    }
}
