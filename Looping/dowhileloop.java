/* 
 * Using Do While loop to to find sum of N numbers
*/

import java.util.*;

public class dowhileloop {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int sum=0, i=0;

        System.out.print("Enter value of N : ");
        int n = sc.nextInt();

        do {
            i++;
            sum = sum+i;
        } while (i<n);

        System.out.println("Sum of "+n+" numbers : "+ sum);
        
    }
}
