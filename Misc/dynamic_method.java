/*
 * Showcasing example of Dynamic Method Dispatch
*/

class A  {
    void test () {
        System.out.println("Inside A's test method!");
    }
}

class B extends A {
    // Overriding test
    void test () {
        System.out.println("Inside B's test method!");
    }
}

class C extends B {
    // Overriding test
    void test () {
        System.out.println("Inside C's test method!");
    }
}

public class dynamic_method {
    public static void main(String args[]) {
        A a = new A(); // Object of class A
        B b = new B(); // Object of class B
        C c = new C(); // Object of class C

        A ref;
        
        ref = a;
        ref.test(); // Calling A's test method

        ref = b;
        ref.test(); // Calling B's test method

        ref = c;
        ref.test(); // Calling C's test method

    }
}