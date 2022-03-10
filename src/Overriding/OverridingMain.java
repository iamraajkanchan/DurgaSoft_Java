package Overriding;

public class OverridingMain {
    public static void main(String[] args) {
        /* In the below code 'new Parent()' is a runtime method */
        Parent p = new Parent();
        /* In the below code 'new Children()' is a runtime method */
        Children c = new Children();
        /* In the below code 'new Children()' is a runtime method */
        Parent p1 = new Children();
    }
}
