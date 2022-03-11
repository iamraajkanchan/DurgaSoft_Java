package Overriding;

public class OverridingMain {
    public static void main(String[] args) {

        Parent p = new Parent();
        p.m1(10);

        Children c = new Children();
        c.m1(10);

        Parent p1 = new Children();
        p1.m1(10);
    }
}
