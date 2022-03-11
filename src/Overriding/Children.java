package Overriding;

public class Children extends Parent {
    /* This is an example of Overloading but not Overriding */
    /* This is an instance level method */
    public void m1(int x) {
        System.out.println("Child class method with int type argument.");
    }
}
