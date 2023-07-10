package interfaceWithClass;

public class InterfaceWithClassPersonMain {
    public static void main(String[] args) {
        InterfaceWithClassPerson interfaceWithClassPerson = new InterfaceWithClassPerson("Chris", "Brown");
        displayPersonDetail(interfaceWithClassPerson);
    }

    public static void displayPersonDetail(InterfaceWithClassPersonInterface interfaceWithClassPersonInterface) {
        System.out.println(interfaceWithClassPersonInterface.getFirstName());
        System.out.println(interfaceWithClassPersonInterface.getLastName());
    }
}
