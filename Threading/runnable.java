class A implements Runnable {
    public void run() {
        try {
            for(int i=2; i<=20; i+=2) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class B implements Runnable {
    public void run() {
        try {
            for(int i=1; i<=20; i+=2) {
                System.out.println(i);
                Thread.sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

public class runnable{
    public static void main(String args[]){
        A ob1 = new A();
        B ob2 = new B();

        Thread t1 = new Thread(ob1);
        Thread t2 = new Thread(ob2);

        t1.start();
        t2.start();
    }
}