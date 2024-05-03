/*
 * To execute, make sure you have a .txt file called "testing" in the same folder which has some data to copy.
*/

import java.io.*;

public class copy_content {
    public static void main(String args[]) throws IOException {

        FileInputStream fis = new FileInputStream("testing.txt");
        FileOutputStream fos = new FileOutputStream("abc.txt");

        int ch;

        try {
            while((ch = fis.read()) != -1){
                fos.write(ch);
            }
    
            System.out.println("Copy successful.");
            
            fis.close();
            fos.close();

        } catch (Exception e ){
            System.out.println(e);
        }

    }
}