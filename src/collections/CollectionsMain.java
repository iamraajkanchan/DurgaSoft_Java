package collections;

import interfaceAndAbstraction.Student;
import interfaceAndAbstraction.Teacher;

public class CollectionsMain {

    public static void main(String[] args) {
        Object[] students = new Object[1000];
        students[0] = new Student("Vim Payne", 18, 20, 540);
        students[1] = new Teacher("Vim Payne", 18, "St. Theressa School", "9A");
    }
}
