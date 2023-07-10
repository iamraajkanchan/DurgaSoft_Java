package inheritance;

public class Programmer extends Person implements ProgrammerInterface {

    private String companyName;

    public Programmer(String name, int age, double salary, String companyName) {
        super(name, age, salary);
        this.companyName = companyName;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        if (validateProgrammer()) {
            this.companyName = companyName;
        }
    }

    @Override
    public boolean validateProgrammer() {
        if (validateName() && validateAge()) {
            System.out.println("The inputs are valid");
            return true;
        } else {
            System.out.println("Please fill in the details carefully!!! The inputs are not valid.");
            return false;
        }
    }

    @Override
    public boolean validateName() {
        return !this.getName().equals("");
    }

    @Override
    public boolean validateAge() {
        return this.getAge() > 18;
    }

    @Override
    public void validateTeacher() {

    }

    public void showProgrammerName() {
        System.out.println(this.hashCode());
    }
}
