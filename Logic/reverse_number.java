/* 
 * Reversing a number
*/

import java.util.*;

public class reverse_number {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        int rev=0;

        System.out.print("Enter number to reverse : ");
        int n = sc.nextInt();

        while(n !=0){
            int rem = n %10;
            rev = rev * 10 + rem;
            n = n/10;
        }

        System.out.println("Reversed number : "+rev);

    }
}