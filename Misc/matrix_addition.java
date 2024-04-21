/*
 * Performing addition of 3x3 Matrix
*/

import java.util.*;

public class matrix_addition {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        int a[][] = new int[3][3];
        int b[][] = new int[3][3];
        int c[][] = new int[3][3];
        int i,j;

        System.out.println("Enter elements in matrix A:");
        for(i=0; i<3; i++)
        for(j=0; j<3; j++)
        a[i][j] = sc.nextInt();

        System.out.println("Enter elements in matrix B:");
        for(i=0; i<3; i++)
        for(j=0; j<3; j++)
        b[i][j] = sc.nextInt();

        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }

        System.out.println("\nAddition of Matrix : ");
        for(i=0; i<3; i++) {
            for(j=0; j<3; j++) {
                System.out.print(c[i][j]+"\t");
            }
            System.out.println();
        }

    }
}