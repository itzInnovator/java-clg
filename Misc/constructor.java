/* 
 * Showcasing use of two constructors by adding values of two variables a and b
*/

class test {
    int a, b;
    int add;

    // Default constructor
    test(){ 
        a = 10;
        b = 20;
    }

    // Parameterized constructor
    test (int x, int y) {
        a = x;
        b = y;
    }

    // Copy constructor
    test (test obj){
        a=obj.a;
        b=obj.b;
    }

    void sum() {
        add = a+b;
        System.out.println("Addition of a and b : "+(add));
    }
    
}

public class constructor {
    public static void main(String args[]) {
        test obj1 = new test();
        test obj2 = new test(50, 40);

        test obj3 = new test(obj2);

        obj1.sum();
        obj2.sum();
        obj3.sum();
    }
    
}