/* 
 * Using if else statement to check which number is greater.
*/

import java.util.*;

public class ifelse_statement {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter value of a : ");
        int a = sc.nextInt();
        System.out.print("Enter value of b : ");
        int b = sc.nextInt();

        if (a>b) {
            System.out.println("A is greater.");
        } else{
            System.out.println("B is greater.");
        }

    }
}