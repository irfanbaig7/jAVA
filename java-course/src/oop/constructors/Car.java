package oop.constructors;

public class Car {
    String name;
    private int age;
//    private int speed;

    public Car(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public Car(int age) {
        this.age = age;
    }

    public void showDetails(){
        System.out.println(name + " is a good person and he is " + age);
    }



    // getter & setter

    public int getAge(){ // jis intance ne bhi call kiya hoga usko return hogi value
        if (age < 0) return 0; // u can put condition also here
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }
}
