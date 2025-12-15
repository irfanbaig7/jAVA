package Streams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StremesDemo {

    static void main() {

//        this is a example of streams
        List<String> names = List.of("irfan", "rohit", "sachin");
        List<Integer> nums = List.of(1, 2, 3, 4, 5, 6 );

//        example of filtering an traversing
        names.stream().forEach(System.out::println);
        nums.stream()
                .filter(n -> n % 2 == 0)
                .forEach(System.out::println);

//        convert names lists into capatalize letters
        List<String> naams = List.of( "irfan", "rohit" );
        naams.stream()
                .map(String::toUpperCase)
                .forEach(System.out::println);

//        sort into accending order
        List<Integer> numbers = List.of(5, 2, 9, 1);
        numbers.stream()
                .sorted()
                .forEach(System.out::println);



//        COMBINED EXAMPLE

        List<Integer> nummyy = List.of(1,2,3,4,5,6,7);

        List<Integer> result = nummyy.stream()
                .filter(n -> n % 2 == 0) // gives us to all even numbers
                .map(n -> n * 3)
                .sorted()
                .toList(); // create a list here

        System.out.println(result);


//        strems reduce
        int total = List.of(1,2,3,4,5)
                .stream()
                .reduce(0, (a,b) -> a + b);
        System.out.println(total);


//        example 1
        List<Integer> numbersColl = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9);
        numbersColl.stream()
                .filter(n -> (n % 2 == 0))
                .forEach(System.out::println);


//        Streams with different sources

        List<Integer> sabNums =  Arrays.asList(1, 2, 3, 4, 5, 6);
        for (int all : sabNums){
            System.out.println(all);
        }


    }


}
