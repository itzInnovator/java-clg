/* 
 * Showcasing usage of yield() method in Multithreading
*/

class A extends Thread {
    public void run() {
        try {
            for(int i=1; i<=5; i++) {
                if(i == 1) Thread.yield();
                System.out.println("A : "+i);
            }
            System.out.println("Exit from class A");
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class B extends Thread {
    public void run() {
        try {
            for(int j=1; j<=5; j++) {
                System.out.println("B : "+j);
                if (j == 3) stop();
            } 
            System.out.println("Exit from class B");
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}

public class yield_method {
    public static void main(String[] args) {
        A obj1 = new A();
        B obj2 = new B();

        obj1.start();
        obj2.start();

    }
}
