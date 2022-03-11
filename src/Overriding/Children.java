package Overriding;

import java.io.EOFException;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Children extends Parent {
    @Override
    public void m1() {
        System.out.println("Child Class Method");
    }

    /* Prompts Compile Time Exception */
    /*
    @Override
    public void m2() throws Exception {
        System.out.println("Child Class Method that throws Exception");
    }
    */

    @Override
    public void m3() throws IOException {
        System.out.println("Child Class Method that throws IOException");
    }

    /* Prompts Compile Time Exception */
    /*
    @Override
    public void m4() throws Exception {
        System.out.println("Child Class Method that throws Exception");
    }
    */

    @Override
    public void m5() throws FileNotFoundException, EOFException {
        System.out.println("Child Class Method that throws FileNotFoundException and EOFException");
    }

    /* Prompts Compile Time Exception */
    /*
    @Override
    public void m6() throws EOFException, InterruptedException {
        System.out.println("Child Class Method that throws EOFException");
    }
    */

    @Override
    public void m7() throws ArithmeticException, NullPointerException, ClassCastException {
        System.out.println("Child Class Method that throws, ArithmeticException, NullPointerException, ClassCastException");
    }
}
