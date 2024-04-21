/* 
 * Creating our own exception to check whether an entered string matches with the specified string.
*/

import java.util.*;

class noMatchException extends Exception {
    noMatchException(String msg) {
        super(msg);
    }
}

public class case2 {
    public static void main (String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter password : ");
        String password = sc.nextLine();

        try {
            if(!password.equals("password123")) {
                throw new noMatchException("Pasword Authentication Failed.");
            } else {
                System.out.println("Password Matched!");
            }
        } catch (Exception e) {
            System.out.println(e);
        }

        finally {
            System.out.println("Finally keyword always works.");
        }

    }
}
