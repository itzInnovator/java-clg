/* 
 * Performing addition to showcase Method Overloading
*/

class A {
    void add(int a, int b) {
        System.out.println("Addition of a and b : "+(a+b));
    }

    void add(int x, int y, int z) {
        System.out.println("Additon of x, y and z : "+(x+y+z));
    }
}

public class method_overloading {
    public static void main(String args[]) {
        A obj = new A();

        obj.add(20, 30);
        obj.add(10, 20, 70);
    }
}