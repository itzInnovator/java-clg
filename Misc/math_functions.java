/* 
 * Math functions in Java
*/

public class math_functions {
    public static void main(String[] args) {
        
        double x=4;
        double y=2;
        int z=-10;

        System.out.println("Maximum number of x and y is : " +Math.max(x,y));
        System.out.println("Minmum number of x and y is : " +Math.min(x,y));
        System.out.println("Absolute of z is : " +Math.abs(z));
        System.out.println("Square root of x is : "+Math.sqrt(x));
        System.out.println("Power of x and y is : "+Math.pow(x,y));
        System.out.println("Exponential of x is : "+Math.exp(x));
        System.out.println("Rounding number : " +Math.round(10.54d));

    }
}