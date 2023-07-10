package interfaceAndAbstraction.abstractFactoryPattern;

public class CarFactory {
    private CarFactory() {

    }

    public static Car buildCar(CarType type) {
        Car car = null;
        // We can add any GPS Function here which
        // read location property somewhere from configuration
        // and use location specific car factory
        // Currently I'm just using INDIA as Location
        Location location = Location.INDIA;

        switch (location) {
            case USA:
                car = USACarFactory.buildCar(type);
                break;

            case INDIA:
                car = IndiaCarFactory.buildCar(type);
                break;

            default:
                car = DefaultCarFactory.buildCar(type);

        }

        return car;

    }
}
