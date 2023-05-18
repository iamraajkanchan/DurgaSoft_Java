package Generics;

public class GenericsExample {
    public static void main(String... args) {
        displayProperty("A2323");
    }

    public static <T> void displayProperty(T v) {
        System.out.println("Roll Number: " + v.toString());
    }
}
