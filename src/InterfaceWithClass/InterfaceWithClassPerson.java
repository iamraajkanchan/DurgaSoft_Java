package InterfaceWithClass;

public class InterfaceWithClassPerson implements InterfaceWithClassPersonInterface {
    private final String firstName;
    private final String lastName;
    InterfaceWithClassPersonInterface interfaceWithClassPersonInterface;

    public InterfaceWithClassPerson(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    @Override
    public String getFirstName() {
        return firstName;
    }

    @Override
    public String getLastName() {
        return lastName;
    }
}
