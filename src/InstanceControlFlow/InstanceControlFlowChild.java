package InstanceControlFlow;

public class InstanceControlFlowChild extends InstanceControlFlowParent {

    int x = 100;

    {
        m2();
        System.out.println("Child First Instance Block");
    }

    InstanceControlFlowChild() {
        System.out.println("Child Constructor");
    }

    public static void main(String[] args) {
        InstanceControlFlowChild instanceControlFlowChild = new InstanceControlFlowChild();
        System.out.println("Child Main Method");
    }

    public void m2() {
        System.out.println(y);
    }

    {
        System.out.println("Child Second Instance Block");
    }

    int y = 200;

}
