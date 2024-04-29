/* 
 * Here, we'll be performing tasks using the methods supported by Threading in java.
*/

public class methods {
    public static void main(String args[]) {

        try {

            Thread t = Thread.currentThread();

            t.setName("Demo Thread");
            t.setPriority(4);

            System.out.println(t.getName());
            System.out.println(t.getPriority());
            System.out.println(t.isAlive());

            System.out.println(t);

            t.stop();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}