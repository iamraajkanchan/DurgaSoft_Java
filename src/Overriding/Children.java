package Overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Children extends Parent {
    /* In the technique of Method Hiding, you can't use the annotation @Override */
    // @Override
    /* This is a class level method */
    public static void m1() {
        System.out.println("Child Class Method with Static keyword");
    }
}
