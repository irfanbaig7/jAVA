package oop.encapsulation;

class  Car {

    private String brand;
    private String color;
    private int speed;

    public Car(String brand, String color, int speed) {
        this.brand = brand;
        this.color = color;
//        this.speed = speed;
        setSpeed(speed);
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        if (speed < 0) speed = 0;
        this.speed = speed;
    }

    public void drive(){
        System.out.println(brand + " is driving at " + speed);
    }
}


public class EncapsultionDemo {

    static void main(String[] args) {

        Car car1 = new Car("tata", "white", 180);
        car1.setSpeed(500);
        car1.drive();
        Car car2 = new Car("kia", "blue", -200);
        car2.drive();

//        koyi bhi set kar rha hai aur get kar rha hai 😒.

//        car1.speed = 280;
//        car1.setSpeed(300);

//        System.out.println("New speed is : " + car1.speed);
//        System.out.println("New speed using getSpeed : " + car1.getSpeed());


//        solutions..





    }

}
