package interfaceAndAbstraction.abstractFactoryPattern;

public class LuxuryCar extends Car {
    LuxuryCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to a Luxury Car");
    }
}
