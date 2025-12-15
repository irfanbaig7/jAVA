package oop.constructors;

public class ConstructorsDemo {
    public static void main(String[] args) {

        // using constructor
        Car car2 = new Car("vishal", 45);
        Car car3 = new Car("ram", 18);
        Car car4 = new Car("sunil", 15);
        car2.showDetails();
        car3.showDetails();
        car4.showDetails();

        // getter & setter
        Car car1 = new Car("ifff", 22);
        car1.showDetails();

        System.out.println(car1.getAge());

        car1.setAge(56);
        System.out.println(car1.getAge());

        System.out.println(car1.getName());






    }
}
