/* 
 * Creating a user-defined exception that'll throw an Exception if the entered salary is negative
*/

import java.util.*;

class negativeSalary extends Exception {
    negativeSalary(String msg) {
        super(msg);
    }
}

public class case3 {
    public static void main(String args[]) {

        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Salary : ");
        int salary = sc.nextInt();

        try {
            if(salary < 0) {
                throw new negativeSalary("Salary is Negative!");
            } 
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
