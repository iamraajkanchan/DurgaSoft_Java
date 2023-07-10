package staticControlFlow;

public class DirectAndIndirectMain {
    static int i = 10;

    static {
        /* This is a Direct Read because i is called within a Static Block */
        System.out.println(i);
    }

    public static void main(String[] args) {
        /* This is Indirect Read because i is called within a method (main or other) */
        System.out.println(i);
    }
}
