/* 
 * Copying elements of one array to another.
*/

public class copying_array {
    public static void main(String args[]) {

        int a1[] = new int[] { 10, 20, 30, 40, 50 };
        int a2[] = new int[a1.length];

        int i;

        // Copying array elements of a1 into a2
        for (i = 0; i < a1.length; i++) {
            a2[i] = a1[i];
        }

        // Displaying data

        System.out.println("Elements in a1 : ");
        for (i = 0; i < a1.length; i++) {
            System.out.print(a1[i] + "\t");
        }

        System.out.println("\n\nElements in a2 : ");
        for (i = 0; i < a2.length; i++) {
            System.out.print(a2[i] + "\t");
        }

    }
}