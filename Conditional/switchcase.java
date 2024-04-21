/*
 * Showcasing usage of Switch Case statement by performing different arithmetic operations.
*/

import java.util.*;

public class switchcase {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a : ");
        int a = sc.nextInt();
        System.out.print("Enter b : ");
        int b = sc.nextInt();

        System.out.print("[1 - Add, 2 - Subtract, 3 - Multiply, 4 - Divide]\nEnter choice : ");
        int choice = sc.nextInt();

        switch(choice) {
            case 1:
                System.out.println("Addition : "+(a+b));
                break;
                
            case 2:
                System.out.println("Subtraction : "+(a-b));
                break;

            case 3:
                System.out.println("Multiplication : "+(a*b));
                break;

            case 4:
                System.out.println("Division : "+(a/b));
                break;
            
            default:
                System.out.println("Invalid choice provided.");
        }

    }
}
