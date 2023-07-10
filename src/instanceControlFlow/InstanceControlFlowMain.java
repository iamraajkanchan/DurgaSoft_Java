package instanceControlFlow;

public class InstanceControlFlowMain {
    int i = 10;

    {
        m1();
        System.out.println("First Instance Block");
    }

    InstanceControlFlowMain() {
        System.out.println("Constructor");
    }

    public static void main(String[] args) {
        InstanceControlFlowMain mainObject = new InstanceControlFlowMain();
        System.out.println("Main Method");
    }

    public void m1() {
        System.out.println(j);
    }

    {
        System.out.println("Second Instance Block");
    }

    int j = 20;
}
