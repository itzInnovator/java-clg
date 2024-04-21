/*
 * To execute, make sure you have a .txt file called "testing" in the same folder. Or just specify the path.
*/

import java.io.*;

public class byte_reading {
    public static void main(String args[]) throws IOException {

        FileInputStream fis = new FileInputStream("testing.txt");
        int ch;
        
        try {
            while((ch = fis.read()) != -1) {
                System.out.print((char)ch); // casting integer to character datatype
            }

            fis.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
