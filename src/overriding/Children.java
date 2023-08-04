package overriding;

public class Children extends Parent {
    public String variable = "Children-Variable";

    public void getAddress() {
        System.out.println("Queens, New York");
    }

    public void getOfficeAddress() {
        System.out.println("Rochester, Queens, New York");
    }

    public static void getCustomClassName() {
        System.out.println(Children.class.getName());
    }
}
