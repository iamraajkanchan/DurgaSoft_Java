package TypeCasting;

public class TypeCastingMain {
    public static void main(String[] args) {
        String s = new String("India");
        Object obj1 = (Object) s;

        Integer i = new Integer(10);
        Number n1 = (Number) i;
        Object obj2 = (Object) n1;
        System.out.println(i.equals(n1));
        System.out.println(n1.equals(obj2));

        /* The above code can be minimized in the following form */
        Number n2 = new Integer(10); // First 2 lines
        Object obj3 = new Integer(10); // First 3 lines
        System.out.println(n2.equals(obj3));

        Child child = new Child();
        child.m1();
        child.m2();

        ((Parent) child).m1();
        /* As this is a reference of Parent class, method of Child class is no longer available */
        // ((Parent) child).m2(); // Prompts Compile Time Error.

        C c = new C();
        c.m1();
        ((B) c).m1();
        ((A) ((B) c)).m1();

        System.out.println(c.x);
        System.out.println(((B) c).x);
        System.out.println(((A) ((B) c)).x);
        ;

        StaticC staticC = new StaticC();
        staticC.m1();
        ((StaticB) staticC).m1();
        ((StaticA) ((StaticB) staticC)).m1();
    }
}

class Parent {
    public void m1() {
        System.out.println("Method of Parent Class");
    }
}

class Child extends Parent {
    public void m2() {
        System.out.println("Method of Child Class");
    }
}

class A {
    int x = 777;

    public void m1() {
        System.out.println("Method of A Class");
    }
}

class B extends A {
    int x = 888;

    @Override
    public void m1() {
        System.out.println("Method of B Class");
    }
}

class C extends B {
    int x = 999;

    @Override
    public void m1() {
        System.out.println("Method of C Class");
    }
}

class StaticA {
    public static void m1() {
        System.out.println("Method of StaticA Class");
    }
}

class StaticB extends StaticA {
    public static void m1() {
        System.out.println("Method of StaticB Class");
    }
}

class StaticC extends StaticB {
    public static void m1() {
        System.out.println("Method of StaticC Class");
    }
}