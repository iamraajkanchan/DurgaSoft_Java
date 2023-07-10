package strings;

public class StringsExample {
    public static void main(String[] a) {
        int number;
        double doubleNumber;
        float floatNumber;
        long longNumber;
        char characterA;
        boolean isValid;
        byte byteNumber;
        short shortNumber;

        String nameString = "John";
        nameString = "Rebecca";
        nameString += " King";
        System.out.println(nameString);

        String classString = new String("Tenth");

        StringBuilder nameBuilder = new StringBuilder("John");
        nameBuilder.append(" Wick");
        System.out.println(nameBuilder);
        nameBuilder.reverse();
        System.out.println(nameBuilder);

        StringBuffer nameBuffer = new StringBuffer("John");
        nameBuffer.append(" Cena");
        System.out.println(nameBuffer);
        nameBuffer.reverse();
        System.out.println(nameBuffer);
    }
}
