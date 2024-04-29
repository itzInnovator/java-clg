/* 
 * Here, we'll be printing numbers between 1 - 10 in ascending and descending order simultaneously
*/

class thread1 extends Thread {
    public void run() {
        try{
            for(int i=1; i<=10; i++){
                System.out.println(i);
                sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class thread2 extends Thread {
    public void run(){
        try {
            for(int i=10; i>=1; i--) {
                System.out.println(i);
                sleep(500);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

public class case2 {
    public static void main(String args[]){
        
        thread1 t1 = new thread1();
        thread2 t2 = new thread2();

        t1.start();
        t2.start();

    }
}