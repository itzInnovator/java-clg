/*
 * Put your own file path instead of "byte_reading.java" at line 10 or just create a file with that name and insert data.
*/

import java.io.*;

public class counting_spaces {
    public static void main(String args[]) throws IOException {
        
        FileInputStream fis = new FileInputStream ("byte_reading.java");

        int c;
        int space_count=0;

        try {
            while((c = fis.read()) != -1){

                if(c == ' ') {
                    space_count++;
                }

            }
            
            System.out.println("Number of spaces in the file : "+ space_count);

            fis.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
