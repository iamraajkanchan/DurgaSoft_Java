package staticBlock;

public class PrintWithConstructor {
    static PrintWithConstructor printWithConstructor = new PrintWithConstructor();

    PrintWithConstructor() {
        System.out.println("I can print");
        System.exit(0);
    }
}
