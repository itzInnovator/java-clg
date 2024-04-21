/* 
 * Find the ASCII value of a number
*/

import java.util.*;

public class find_ascii {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number : ");
        char n = sc.next().charAt(0);

        int ascii = (int)n;

        System.out.println("The ASCII value of "+n+" is : "+ascii);

    }
}
