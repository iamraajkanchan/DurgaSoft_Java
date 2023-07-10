package interfaceAndAbstraction.abstractFactoryPattern;

public class MiniCar extends Car {
    MiniCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to a Mini Car");
    }
}
