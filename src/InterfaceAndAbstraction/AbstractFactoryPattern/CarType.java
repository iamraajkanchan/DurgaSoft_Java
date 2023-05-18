package InterfaceAndAbstraction.AbstractFactoryPattern;

public enum CarType {
    MICRO(), MINI, LUXURY;

    void update(String value) {
        MICRO(value);
    }

    private void MICRO(String value) {

    }
}

