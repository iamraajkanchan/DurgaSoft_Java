package Overloading;

class Animal {
}

class Monkey extends Animal {
}

public class Test {
    public void m1(Animal a) {
        System.out.println("Animal Type Argument");
    }

    public void m1(Monkey m) {
        System.out.println("Monkey Type Argument");
    }
}
