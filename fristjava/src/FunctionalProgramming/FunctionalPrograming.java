package FunctionalProgramming;

import java.util.function.Function;

// functional interfaces
interface Operation {
     int add(int a, int b);
}


interface Play{
    void music();
}


// For Function functional interface
class User{
    String name;
    User(String name){
        this.name = name;
    }
}



public class FunctionalPrograming {

    static void main() {

        Operation op1 = new Operation() {
            @Override
            public int add(int a, int b) {
              return a + b;
            };
        };
        System.out.println(op1.add(10, 20));


//        lambda expression with parameter
        Operation op2 = (a, b) -> a + b;
        System.out.println(op2.add(10, 15));


//        lambda expression withOut parameter
        Play p1 = () -> System.out.println("Music was Playing");
        p1.music();


//        Funcation
        Function<String, Integer> lengthFunc = s -> s.length();
        System.out.println(lengthFunc.apply("Hello"));  // 5

        Function<Integer, Integer> square = n -> n * n;
        System.out.println(square.apply(6));

        Function<User, String> getName = user -> user.name;
        System.out.println(getName.apply(new User("sakshi jadhav")));

//        support Chaining ( like dosome then dosome )
        Function<Integer, Integer> square2 = a -> a * a;
        Function<Integer, Integer> addTwo = a -> a + 2;
        Function<Integer, Integer> result = square2.andThen(addTwo);
        System.out.println(result.apply(5));



//        Runnable interface



    }


}
