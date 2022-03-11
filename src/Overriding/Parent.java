package Overriding;

import java.io.IOException;

public class Parent {
    public void m1() throws Exception {
        System.out.println("Parent Class Method that throws Exception");
    }

    public void m2() {
        System.out.println("Parent Class Method");
    }

    public void m3() throws Exception {
        System.out.println("Parent Class Method that throws Exception");
    }

    public void m4() throws IOException {
        System.out.println("Parent Class Method that throws IOException");
    }

    public void m5() throws IOException {
        System.out.println("Parent Class Method that throws IOException");
    }

    public void m6() throws IOException {
        System.out.println("Parent Class Method that throws IOException");
    }

    public void m7() throws IOException {
        System.out.println("Parent Class Method that throws IOException");
    }
}
