/*
 * Here, we take an example of adding 3 numbers which is declared in three different classes.
*/

class A {
    int a;

    A(int n1) {
        a = n1;
    }
}

class B extends A {
    int b;

    B(int n1, int n2) {
        super(n1);
        b = n2;
    }
}

class C extends B {
    int c;

    C(int n1, int n2, int n3) {
        super(n1,n2);
        c = n3;
    }

    void display() {
        int add = a+b+c;
        System.out.println("Value of A : "+a);
        System.out.println("Value of B : "+b);
        System.out.println("Value of C : "+c);
        System.out.println("\nAddition : "+add);
    }
}

public class multilevel {
    public static void main(String args[]) {
        C obj = new C(10, 30, 20);
        obj.display();
    }
}