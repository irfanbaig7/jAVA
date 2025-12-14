package FunctionalProgramming;

import java.util.function.Function;

public class FunctionaInterDemo {

    public static Function<Integer, Integer> adding = a -> a + 2;
    public static Function<Integer, Integer> minusing = a -> a - 5;


    static void main() {

//        Chaining (andThen use kar ke)
        Function<Integer, Integer> result = adding.andThen(minusing);
        System.out.println(result.apply(20));


        System.out.println(adding.apply(85));
        System.out.println(minusing.apply(55));
    }


}
