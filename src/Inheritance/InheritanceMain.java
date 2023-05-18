package Inheritance;

public class InheritanceMain {
    public static void main(String[] args) {
        /* For Doctors*/
        Person doctor1 = new Doctor("Joe Dane", 24, 56000.0, "Apollo Hospital");
        // Doctor doctor3 = new Parent("Kate Upton", 26, 95000.0);
        /* This is an example of Polymorphism */
        doctor1.showPersonClassName();
        /* This below code is invalid, it prompts compile time error. */
        /* Because reference of Parent class can create object of child class but
         can't access properties and methods of child class */
        // doctor1.showDoctorClassName();
        // So in order to call the method of Child class i.e. Doctor class you have to cast the doctor1 object
        ((Doctor) doctor1).showDoctorClassName();
        Doctor doctor2 = new Doctor("Jane Perry", 24, 65000, "Seven Hospital");
        /* This below code is valid */
        /* Because object of child class can access properties and methods of parent class */
        doctor2.showPersonClassName();
        doctor2.showDoctorClassName();
        /* This below code is invalid. Because reference of Child class can't be used to create object of Parent class */
        // Doctor doctor3 = new Parent("Kate Upton", 26, 95000.0);
        /* For Teachers */
        Person teacher1 = new Teacher("Sumit Vyas", 35, 56000.0, "K.B.C.H");
        /* For Programmers */
        Person programmer1 = new Programmer("Abhishek Tiwari", 28, 125000.0, "Kotak Mahindra");
        Programmer programmer2 = new Programmer("Kiran Rathod", 17, 75000.0, "Shaw Info Solutions");

        /* For Common People */
        printDetails(doctor1, doctor2, teacher1, programmer1, programmer2);
    }

    public static void printDetails(Person... person) {
        for (Person p : person) {
            System.out.println("Name: " + p.getName());
            System.out.println("Institution: " + p.getSalary());
        }
    }
}
