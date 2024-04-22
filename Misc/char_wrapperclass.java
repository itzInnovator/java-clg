/* 
 * Showcasing methods (functions) of Character Wrapper class
*/

public class char_wrapperclass {
    public static void main(String args[]) {

        char c1 = 'h';
        char c2='1';
        char c3=' ';
        char c4 = 'A';

        System.out.println("isLetter? - "+ Character.isLetter(c1));

        System.out.println("isDigit? - "+ Character.isDigit(c2));

        System.out.println("IsLetterOrDigit? - "+Character.isLetterOrDigit(c1));

        System.out.println("isLowerCase? - "+Character.isLowerCase(c1));

        System.out.println("isUpperCase? - "+Character.isUpperCase(c4));

        System.out.println("isWhiteSpace? - "+Character.isWhitespace(c3));

    }
}