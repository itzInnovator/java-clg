/*
 * Here, we'll be trying to print Even and Odd numbers between 1 - 10, simulatenously.
*/

class even extends Thread {
    public void run() {
        try {
            for(int i=2; i<=10; i+=2) {
                System.out.println(i);
                sleep(500);
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

class odd extends Thread {
    public void run() {
        try {
            for(int i=1; i<=2; i+=2) {
                System.out.println(i);
                sleep(500);
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class case1 {
    public static void main(String args[]) {
        even t1 = new even();
        odd t2 = new odd();

        t1.start();
        t2.start();
    }
}