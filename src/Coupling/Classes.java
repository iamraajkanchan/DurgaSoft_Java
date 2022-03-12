package Coupling;

class D {
    public static int m1() {
        return 10;
    }
}

class C {
    static int k = D.m1();
}

class B {
    static int j = C.k;
}

class A {
    static int i = B.j;
}
