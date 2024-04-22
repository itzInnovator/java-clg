/* 
 * Showcasing methods of ArrayList in java
*/

import java.util.*;

public class arraylist {
    public static void main(String args[]) {
        ArrayList<Integer> al = new ArrayList<>();
        al.add(10);
        al.add(20);
        al.add(30);
        al.add(40);

        al.remove(2); // Removes element from index 2

        System.out.println("ArrayList Size : " + al.size()); // Returns size of ArrayList

        Iterator<Integer> iterator = al.iterator();

        System.out.println("\nElements in ArrayList: ");
        while (iterator.hasNext()) {
            int number = iterator.next();
            System.out.println(number);
        }

        iterator.remove(); // Removes the current element

    }
}
