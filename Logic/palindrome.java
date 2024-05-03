/* 
 * Used to check whether a string is palindrome or not.
*/

import java.util.*;

public class palindrome {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter string : ");
        String str = sc.nextLine();

        int length = str.length() - 1;
        int i = 0, flag = 0;
        int r = length;

        while (i <= r) {
            if (str.charAt(i) == str.charAt(r)) {
                i++;
                r--;
            } else {
                flag = 1;
                break;
            }
        }

        if (flag == 0) {
            System.out.println("String is a Palindrome!");
        } else {
            System.out.println("String is not a Palindrome!");
        }

    }
}