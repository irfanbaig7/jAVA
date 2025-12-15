package revise.encap;

class BankAcc {
    private double bal;
    void depo(double amt){
        if (amt > 0){
            bal += amt;
        }
    }

    void withd(double amt){
        if ( amt > 0 && amt <= bal){
            bal -= amt;
        }
    }

    double getBal(){
        return bal;
    }

//    void getBal(){
//        System.out.println("Bal : " + bal);
//    }

//    User Details
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0){
            this.age = age;
        }
    }
}
