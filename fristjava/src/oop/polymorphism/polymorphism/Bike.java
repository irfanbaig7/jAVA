package oop.polymorphism.polymorphism;

public class Bike extends Vehicle {

    boolean hasCarrier = true;

    @Override
    public void start(){
//        super.start();
        System.out.println("Starting a Bike...");
    }

    public void start(String greet){
        System.out.println("Starting a Bike..." + greet);
    }



    public Bike(String brand, int speed, boolean hasCarrier) {
        super(brand, speed);
        this.hasCarrier = hasCarrier;
    }

    public boolean isHasCarrier() {
        return hasCarrier;
    }

    public void setHasCarrier(boolean hasCarrier) {
        this.hasCarrier = hasCarrier;
    }
}
