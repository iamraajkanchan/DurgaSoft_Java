package overriding;

public class Parent extends AbstractRelation {
    @Override
    public void displayRelation() {
        System.out.println("I am the Parent Class of Children Class");
    }

    public void property() {
        System.out.println("Cash + Land + Gold");
    }

    public void marry() {
        System.out.println("Marry Jane");
    }
}
