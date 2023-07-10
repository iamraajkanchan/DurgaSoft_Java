package inheritance;

public class Teacher extends Person {

    final private String schoolName;

    public Teacher(String name, int age, double salary, String schoolName) {
        super(name, age, salary);
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    public void showTeacherClassName() {
        System.out.println(this.hashCode());
    }
}
