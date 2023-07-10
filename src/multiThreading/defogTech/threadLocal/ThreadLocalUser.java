package multiThreading.defogTech.threadLocal;

public class ThreadLocalUser {
    private final String name;
    private final String role;
    private final String mobileNumber;

    public ThreadLocalUser(String name, String role, String mobileNumber) {
        this.name = name;
        this.role = role;
        this.mobileNumber = mobileNumber;
    }

    public void showDetails() {
        System.out.println("Name: " + name + " ,Role: " + role + " ,Mobile Number: " + mobileNumber);
    }
}
