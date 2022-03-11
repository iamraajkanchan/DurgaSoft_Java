package Overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Parent.m1();
        Children.m1();

        Parent p = new Parent();
        p.m1();

        Children c = new Children();
        c.m1();

        Parent p1 = new Children();
        p1.m1();
    }
}
