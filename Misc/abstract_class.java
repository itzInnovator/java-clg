/* 
 * Showcasing usage of Abstract class
*/

abstract class A {
    abstract void callme();

    void callmetoo() {
        System.out.println("Method of A class");
    }
}

class B extends A {
    void callme() {
        System.out.println("callme Method called");
    }
}

public class abstract_class {
    public static void main(String args[]) {
        B b = new B();
        b.callme();
        b.callmetoo();
    }
}
