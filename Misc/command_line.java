/* 
 * Showcasing usage of Command Line Argument to add two integers
*/

public class command_line {
    public static void main(String args[]) {
        
        int a = Integer.parseInt(args[0]);
        int b = Integer.parseInt(args[1]);

        int sum = a+b;

        System.out.println("Sum of a and b : "+sum);

    }
}

/* 
How to Execute this program:
   Run 'javac command_line.java'
   Then run 'java command_line <value1> <value2>'
*/