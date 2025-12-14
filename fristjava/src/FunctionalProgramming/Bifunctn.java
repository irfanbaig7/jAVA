package FunctionalProgramming;

import java.util.function.BiFunction;

public class Bifunctn {

    static BiFunction<Integer, Integer, Integer> addFn = Integer::sum;
    static BiFunction<Integer, Integer, Integer> subFn = (a,b) -> a - b;

    static void main() {
        System.out.println(addFn.apply(12, 12));
        System.out.println(subFn.apply(12, 10));

    }

}
