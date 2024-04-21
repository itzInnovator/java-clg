/* 
 * Using user-defined packages to perform Arithmetic operations
*/

import arithmetic.*;
import java.util.*;

public class test {
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("[1 - Add, 2 - Subtract, 3 - Multiply, 4 - Divide]\nEnter Choice : ");
        int c = sc.nextInt();

        switch(c) {
            case 1:
                addition obj1 = new addition(5,10);
                System.out.println();
                obj1.add();
                break;

            case 2:
                subtraction obj2 = new subtraction(100, 40);
                System.out.println();
                obj2.sub();
                break;

            case 3:
                multiplication obj3 = new multiplication(5, 2);
                System.out.println();
                obj3.mul();
                break;
            
            case 4:
                division obj4 = new division(100, 5);
                System.out.println();
                obj4.div();
                break;
            
            default:
                System.out.println("\nWrong Input!");
        }

    }
}
