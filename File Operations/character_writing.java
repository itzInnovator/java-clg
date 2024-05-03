/*
 * To execute, make sure you have a .txt file called "testing" in the same folder. Or just specify the path.
*/

import java.io.*;

public class character_writing {

    public static void main(String args[]) throws IOException {

        try{

            FileWriter fw = new FileWriter("testing.txt");

            fw.write("where even is satoshi nakamoto??");

            fw.close();

        } catch (Exception e){
            System.out.println(e);
        }

        System.out.println("Operation successful.");

    }
}