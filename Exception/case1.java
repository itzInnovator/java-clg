/* 
 * Dividng by Zero to check whether Exception is caught or not
*/

public class case1 {
    public static void main(String args[]) {

        int n=10;

        try {
            int divide = n/0;

            System.out.println("Divion : "+divide);
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}