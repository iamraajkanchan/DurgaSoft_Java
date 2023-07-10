package intefaceAndAbstraction;

public class InterfaceAndAbstractMain {
    public static void main(String args[]) {
        Student student1 = new Student("Jai Kishan", 12, 101, 246);
        Student student2 = new Student("Suraj Kishan", 11, 102, 236);
        Teacher teacher1 = new Teacher("Ramesh Pawar", 36, "Mathematics", "10 A");
        Teacher teacher2 = new Teacher("Jitesh Mahatre", 39, "History", "8 B");
        student1.printFirstSemesterMarks();
        student1.printSecondSemesterMarks();
        printStudentDetails(student1);
        printStudentDetails(student2);
        printTeacherDetails(teacher1);
        printTeacherDetails(teacher2);
    }

    /* You can call only static methods in main method */
    public static void printStudentDetails(Student student) {
        System.out.println(student);
    }

    /* You can call only static methods in main method */
    public static void printTeacherDetails(Teacher teacher) {
        System.out.println(teacher);
    }

}
