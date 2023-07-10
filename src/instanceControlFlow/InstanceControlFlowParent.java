package instanceControlFlow;

public class InstanceControlFlowParent {

    int i = 0;

    {
        m1();
        System.out.println("Parent First Instance Block");
    }

    InstanceControlFlowParent() {
        System.out.println("Parent Constructor");
    }

    public static void main(String[] args) {
        InstanceControlFlowParent instanceControlFlowParent = new InstanceControlFlowParent();
        System.out.println("Parent Main Method");
    }

    public void m1() {
        System.out.println(j);
    }

    int j = 20;

}
