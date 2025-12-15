package revise.inhert;


class A {
    int x = 20;
    void show(){
        System.out.println("A");
    }
}

class B extends A {
    int x = 10;
//    void printX(){
//        System.out.println(super.x);
//        System.out.println(x);
//    }
    void show(){
//        super.show();
        System.out.println("B");
    }
}

public class C {
    static void main(String[] args) {
        B obj = new B();
//        obj.printX();
        System.out.println(obj.x);
        obj.show();

//        VARIABLE  → reference type decide karta hai
//        METHOD    → object type decide karta hai
//        Variables → compile-time binding
//        Methods   → runtime binding


    }
}
