package inheritance;

public class Person {
    final private String name;

    final private int age;
    final private double salary;

    public Person(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public double getSalary() {
        return salary;
    }

    public void showPersonClassName() {
        System.out.println(this.hashCode());
    }
}
