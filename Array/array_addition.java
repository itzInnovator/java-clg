/* 
 * We'll be finding the sum of array elements
*/

import java.util.*;

public class array_addition {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        int i, sum=0;

        System.out.print("Enter size of array : ");
        int n = sc.nextInt();

        int a[] = new int[n];

        System.out.println("Enter elements in array : ");
        for(i=0; i<n; i++)
        a[i] = sc.nextInt();
        
        for(i=0; i<n; i++) {
            sum = sum + a[i];
        }

        System.out.println("Addition of elements in array : "+sum);

    }
}