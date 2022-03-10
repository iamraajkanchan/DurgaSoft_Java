package InterfaceAndAbstraction;

public class Teacher extends Person {
    final private String subject;
    final private String className;

    public Teacher(String name, int age, String subject, String className) {
        super(name, age);
        this.subject = subject;
        this.className = className;
    }

    public String getSubject() {
        return subject;
    }

    public String getClassName() {
        return className;
    }

    @Override
    public String toString() {
        return "Teacher :: Name :: " + getName() + " :: Age :: " + getAge() + " :: Subject :: " + subject + " :: ClassName :: " + className;
    }
}