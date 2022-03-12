package Overriding;

import java.util.*;

public class OverridingMain {
    public static void main(String[] args) {

        Parent p = new Parent();
        System.out.println(p.variable);

        Children c = new Children();
        System.out.println(c.variable);

        Parent p1 = new Children();
        System.out.println(p1.variable);

    }
}
