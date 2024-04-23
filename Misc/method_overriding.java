/*
 * Performing addition to showcase Method Overriding
*/

class A {
    void test(int a, int b) {
        System.out.println("Addition from Class A : "+(a+b));
    }
}

class B extends A {
    void test(int a, int b) {
        System.out.println("Addition from Class B : "+(a+b));
    }
}

public class method_overriding {
    public static void main(String args[]) {

        B obj = new B();
        obj.test(20, 30);

    }
}


