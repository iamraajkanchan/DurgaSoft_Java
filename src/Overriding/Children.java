package Overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Children extends Parent {

    /* You can't override a static method of Parent Class */
    /*
    @Override
    public void m1() {
        System.out.println("Child Class Method with Static keyword");
    }
    */

    /* You can't use static keyword on the method that you inherited from Parent Class */
    /*
    @Override
    public static void m2() {
        System.out.println("Child Class Method with Static Keyword");
    }
    */
}
