/* 
 * Showcasing how to create Vector, insert values and use different methods of Vector.
*/

import java.util.*;

public class vector {
    
    public static void main(String args[]) {

        Vector v = new Vector(3,2); 

        v.addElement("hello");
        v.addElement("testing");
        v.addElement(new Integer(50));
        v.addElement(new Float(5.4f));

        v.insertElementAt(new Double(3.14d), 3); // Inserting element at index 3
        v.insertElementAt(new Character('i'), 1); // Inserting element at index 1

        v.removeElementAt(4); // Removes element stored at index 4.

        System.out.println("Vector Size : "+v.size()); // Returns the size of Vector
        System.out.println("Vector Capacity : "+v.capacity()); // Returns the capacity of Vector i.e. number of elements in can store
        System.out.println("Element At index 4 : "+v.elementAt(4)); // Returning element present at index 4

        System.out.println("First Element : "+v.firstElement()); // Returning the first element in the Vector list
        System.out.println("Last Element : "+v.lastElement()); // Returning the last element in the Vector list

        System.out.println("Does it contain character 'i'? "+v.contains('i')); // Returns true if character 'i' exists. Else, returns false

        System.out.println("\nVector List : \n"+v); // Returns the final Vector list

    }

}