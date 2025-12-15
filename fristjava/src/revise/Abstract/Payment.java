package revise.Abstract;

abstract class Payment {
    abstract void pay();
    void receipt(){
        System.out.println("Receipt Gen");
    }
}
