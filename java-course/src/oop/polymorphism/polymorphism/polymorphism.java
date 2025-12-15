package oop.polymorphism.polymorphism;

public class polymorphism {
    static void main(String[] args) {
        Car c1 = new Car("toyoto", 21, 9);
        c1.info();

        Bike b1 = new Bike("shine", 80, true);
        b1.info();

        c1.start();
        b1.start();

        Vehicle v1  = new Vehicle("puma", 555);
        v1.start();

//        method over-riding ( Run time polymorphism )
        Vehicle v2  = new Car("audi", 808, 9);
        v2.start();

        Vehicle v3  = new Bike("x100", 50, false);
        v3.start();
        b1.start();


    }
}
