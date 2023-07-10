package interfaceAndAbstraction;

public class Student extends Person implements Semester {
    final private int rollNo;
    final private int marks;

    public Student(String name, int age, int rollNo, int marks) {
        super(name, age);
        this.rollNo = rollNo;
        this.marks = marks;
    }

    public int getRollNo() {
        return rollNo;
    }

    public int getMarks() {
        return marks;
    }

    // Note, to use the variable of an Interface you won't have to implement the interface.
    // As the variable itself is public and static by default, we can access the variable directly but, you can't change it as it is final.
    @Override
    public void printFirstSemesterMarks() {
        System.out.println("Marks of " + Semester.firstSemester + " is: " + this.marks);
    }

    @Override
    public void printSecondSemesterMarks() {
        System.out.println("Marks of " + semesterName("Second Semester") + " is: " + this.marks);
    }

    @Override
    public String toString() {
        return "Student :: Name :: " + getName() + " :: Age :: " + getAge() + " :: Roll No :: " + rollNo + " :: Marks :: " + marks;
    }
}