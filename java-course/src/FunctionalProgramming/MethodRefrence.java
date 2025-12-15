package FunctionalProgramming;

import java.lang.classfile.instruction.DiscontinuedInstruction;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class MethodRefrence {
    static void main() {
//        :: --- Syntax

        List<String> usernames = Arrays.asList("irfan", "rohit", "virat");

//        step - 1
//        usernames.forEach(new Consumer<String>() {
//            @Override
//            public void accept(String s) {
//                System.out.println(s);
//            }
//        });

//        usernames.forEach((String s) -> System.out.println(s));

//        step - 2
//        usernames.forEach((String s) -> System.out.println(s));

//        step - 3
//        usernames.forEach((s) -> System.out.println(s));

//        step - 4 ( Method Refrence )
        usernames.forEach(System.out::println);





    }
}
