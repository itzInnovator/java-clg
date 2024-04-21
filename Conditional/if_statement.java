/* 
 * Using if statement to only print Odd numbers between 1 to 20
*/

public class if_statement {
    public static void main(String args[]) {

        // Scanner sc = new Scanner(System.in);

        for(int i = 1; i<=20; i++) {
            if(i%2 == 0) continue;

            System.out.println(i);
        }

    }
}
