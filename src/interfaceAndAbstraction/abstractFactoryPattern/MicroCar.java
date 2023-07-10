package interfaceAndAbstraction.abstractFactoryPattern;

public class MicroCar extends Car {
    MicroCar(Location location) {
        super(CarType.MICRO, location);
        construct();
    }

    @Override
    void construct() {
        System.out.println("Connecting to a Micro Car");
    }
}
