package overriding;

public class OverridingSimulator {
    public static void main(String[] args) {

        Parent parentInstance = new Parent();
        System.out.println(parentInstance.variable);
        parentInstance.getAddress();
        System.out.println("=====================================================");

        Children childrenInstance = new Children();
        System.out.println(childrenInstance.variable);
        childrenInstance.getAddress();
        System.out.println("=====================================================");

        Parent parentInstanceDerivedFromChildren = new Children();
        System.out.println(parentInstanceDerivedFromChildren.variable);
        parentInstanceDerivedFromChildren.getPermanentAddress();
        ((Children) (parentInstanceDerivedFromChildren)).getOfficeAddress();
        // parentInstanceDerivedFromChildren.getAddress();
        parentInstanceDerivedFromChildren.getAddress();
        System.out.println("=====================================================");

    }
}
