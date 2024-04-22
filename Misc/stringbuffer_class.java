/* 
 * Showcasing usage of StringBuffer Class methods
*/

public class stringbuffer_class {
    public static void main(String args[]) {

        StringBuffer sb = new StringBuffer("this is");

        sb.append(" testing");
        System.out.println(sb); // Appending data 

        sb.insert(7, " a");
        System.out.println(sb); // Inserting data

        sb.delete(0, 10);
        System.out.println(sb); // Deleting data

        System.out.println("Length of String : "+sb.length()); // Length of the object

        System.out.println(sb.reverse()); // Reversing string

    }
}