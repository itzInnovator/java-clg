/*
 * Put your own file path instead of "byte_reading.java" at line 10 or just create a file with that name and insert data.
*/

import java.io.*;

public class count_lines {
    public static void main(String args[]) throws IOException {

        FileReader fr = new FileReader("byte_reading.java");
        BufferedReader br = new BufferedReader(fr);

        String s;
        int line_count=0;

        try {
            while((s = br.readLine()) != null){
                line_count++;
            }
            System.out.println("Number of lines in the file : "+ line_count);

            fr.close();
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}