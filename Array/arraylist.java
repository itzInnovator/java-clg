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

        al.remove(2);

        System.out.println("ArrayList Size : "+al.size());

        
        Iterator<Integer> iterator = al.iterator();

        System.out.println("Has next element? : "+iterator.hasNext());

        while (iterator.hasNext()) {
          int number = iterator.next();
          System.out.println(number);
        }

    }
}


