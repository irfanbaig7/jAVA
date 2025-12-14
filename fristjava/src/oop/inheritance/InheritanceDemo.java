package oop.inheritance;

public class InheritanceDemo {
    static void main(String[] args) {
        Car car1 = new Car("toyoto", 21, 9);
//        car1.speed = 30;
//        car1.brand = "Maruti ";
        car1.info();

        Bike b1 = new Bike("shine", 80, true);
        b1.info();
    }
}
