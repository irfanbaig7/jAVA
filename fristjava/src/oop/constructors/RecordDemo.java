package oop.constructors;

record Bike(String brand, int speed){}

public class RecordDemo {

    static void main(String[] args) {
        Bike bike = new Bike("tvs", 120);
        System.out.println("Brand is: " + bike.brand() + " an speed was: " + bike.speed());
        System.out.println(bike);
    }

}
