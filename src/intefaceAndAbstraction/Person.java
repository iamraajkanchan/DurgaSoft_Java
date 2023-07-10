package intefaceAndAbstraction;

public abstract class Person {
    final private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        if (validateAge(age)) {
            this.age = age;
        }
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    private boolean validateAge(int age) {
        return age > 3;
    }
}