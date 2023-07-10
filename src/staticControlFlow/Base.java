package staticControlFlow;

public class Base {
    static int i = 10;

    static {
        m1();
        System.out.println("Base Static Block");
    }

    public static void main(String[] args) {
        m1();
        System.out.println("Base Main Method");
    }

    public static void m1() {
        System.out.println(j);
    }

    static int j = 20;
}

class Derived extends Base {
    static int x = 100;

    static {
        m2();
        System.out.println("Derived First Static Block");
    }

    public static void main(String[] args) {
        m2();
        System.out.println("Derived Main Method");
    }

    public static void m2() {
        System.out.println(y);
    }

    static {
        System.out.println("Derived Second Static Block");
    }

    static int y = 200;
}