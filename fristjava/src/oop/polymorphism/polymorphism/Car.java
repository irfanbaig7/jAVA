package oop.polymorphism.polymorphism;

public class Car extends Vehicle {

    private int doors;

    @Override
    public void start(){
//        super.start();
        System.out.println("Starting a Car...");
    }

    public Car(String brand, int speed, int doors) {
        super(brand, speed);
        this.doors = doors;
    }

    @Override
    public void info() {
        super.info();
        System.out.println("car is: " + getBrand() + "   Speed is: " + getSpeed() + " " + doors);
    }
}
