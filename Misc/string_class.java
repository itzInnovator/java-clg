/* 
 * Showcasing usage of String Class methods
*/

public class string_class {
    public static void main(String args[]) {

        String s1 = "testing";

        System.out.println("Length of String : "+s1.length()); // Returns the length of string

        char c1 = s1.charAt(3);
        System.out.println("Character at index 3 : "+c1); // Returning character at index 3

        System.out.println("Index of character 't' : "+s1.indexOf('t')); // Returning index of character 't'
        System.out.println("Last Index of Character 'g' : "+s1.lastIndexOf('g'));

        System.out.println("Uppercase : "+s1.toUpperCase()); // Converting string to Uppercase

        String s2 = "ABC";
        System.out.println("Lowercase : "+s2.toLowerCase()); // Converting string to Lowercase

        String s3 = "heddo".replace('d', 'l');
        System.out.println("Replacing characters : "+s3); // Replacing the characters
        
        String s4 = "Hello".concat(" World");
        System.out.println("Concatenating String : "+s4); // Concatenating String


    }
}