/*
 * Put your own file path instead of "count_lines.java.java" at line 9 or just create a file with that name and insert data.
*/

import java.io.*;

public class count_words {
    public static void main(String args[]) throws IOException {
        FileReader fr = new FileReader("count_lines.java");

        BufferedReader br = new BufferedReader(fr);

        String s;
        int word_count = 0;

        try {

            while ((s = br.readLine()) != null) {
                String[] words = s.split(" ");
                word_count = word_count + words.length;
            }
            
            System.out.println("Number of words (characters) in the file : " + word_count);

            fr.close();
            br.close();

        } catch (Exception e) {
            System.out.println(e);
        }

    }
}