package intefaceAndAbstraction;

public interface Semester {

    String firstSemester = "First Semester";

    void printFirstSemesterMarks();
    void printSecondSemesterMarks();

    // To write body of a method in Interface, you must declare it as default.
    default String semesterName(String data) {
        return data;
    }
}
