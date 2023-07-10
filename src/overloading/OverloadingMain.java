package overloading;

public class OverloadingMain {
    public static void main(String[] args) {
        Test t1 = new Test();
        Animal a1 = new Animal();
        t1.m1(a1);
        Monkey m1 = new Monkey();
        t1.m1(m1);
        Animal am = new Monkey();
        t1.m1(am);
    }
}