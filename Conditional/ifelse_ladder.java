/*
 * Using if else ladder to check which number is greater amongst 3 numbers.
*/

public class ifelse_ladder {
    public static void main(String args[]) {

        int a=50;
        int b=100;
        int c=63;

        if (a>=c && a>=b) {
            System.out.println("A is Greater.");
        } else if(b >= c && b >= a) {
            System.out.println("B is Greater.");
        } else if(c >= a && c >= b) {
            System.out.println("C is Greater.");
        } 

    }
}
