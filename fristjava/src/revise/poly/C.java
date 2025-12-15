package revise.poly;

public class C {
    void main(String[] args) {
        A obj = new B();
        obj.show();

        A a;
        a = new B();
        a.draw();

        a = new D();
        a.draw();

        a = new A("sakshi");
        a = new A();



//        calc ke ref ka obj bana na padega tabhi method overLoading work execute ho payegi
        Calcc c1 = new Calcc();
        System.out.println(c1.add(10, 15));
        System.out.println(c1.add(10, 15, 20));






    }
}

// imp note >>

//Method call:
//- runtime
//- object based
//- overridden method executes
//
//Variable / static:
//- compile time
//- reference based
