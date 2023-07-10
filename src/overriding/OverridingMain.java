package overriding;

public class OverridingMain {
    public static void main(String[] args) {
        Parent p = new Parent();
        p.marry();
        Children c = new Children();
        c.marry();
        Parent p1 = new Children();
        p1.marry();
    }
}
