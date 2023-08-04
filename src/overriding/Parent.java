package overriding;

public class Parent {
    public String variable = "Parent-Variable";
    public void getAddress() {
        System.out.println("Houston, Texas");
    }
    public void getPermanentAddress() {
        System.out.println("Charleston, Nevada");
    }
    public int hashCode = Parent.class.hashCode();
    public static void getCustomClassName() {
        System.out.println(Parent.class.getName());
    }
}
