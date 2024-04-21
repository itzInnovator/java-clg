/*
 * We'll be taking an example for showcasing Implicit Type Casting in java
*/

public class implicit_casting {
    public static void main(String args[]) {

        int a=10;
        char c = 's';

        int s = a+c; // Adds ASCII value of 's' with 10

        System.out.println("Sum : "+s); // Casting Character to Integer

    }
}