package Inheritance;

public class Doctor extends Person {
    final private String hospitalName;

    public Doctor(String name, int age, double salary, String hospitalName) {
        super(name, age, salary);
        this.hospitalName = hospitalName;
    }

    public String getHospitalName() {
        return hospitalName;
    }

    public void showDoctorClassName() {
        System.out.println(this.hashCode());
    }
}
