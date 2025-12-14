package oop.inheritance;

public class Car extends Vehicle {

    private int doors;

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
//        this.brand = brand;
//        this.speed = speed;
        this.doors = doors;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("car is: " + getBrand() + "   Speed is: " + getSpeed() + " " + doors);
    }
}
