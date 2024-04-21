/*
 * This is an example for Hierarchical Inheritance
*/

class A {
    void display1() {
        System.out.println("This is Class A");
    }
}

class B extends A {
    void display2() {
        System.out.println("This is Class B");
    }
}

class C extends A {
    void display3() {
        System.out.println("This is Class C");
    }
}

class hierarchical {
    public static void main(String args[]) {
        B o1 = new B();
        C o2 = new C();

        o1.display1();
        o1.display2();
        o2.display3();
    }
}