/*
 * Put your own file path instead of "testing.txt" at line 10 or just create a file with that name and insert data.
*/

import java.io.*;

public class count_characters {
    public static void main(String args[]) throws IOException {
        
        FileReader fr = new FileReader("testing.txt");

        int c, char_count=0;

        try {
            while((c = fr.read()) != -1){

                char_count++;

            }
            
            System.out.println("Number of characters in the file : "+ char_count);

            fr.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}