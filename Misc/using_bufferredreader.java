/* 
 * Showcasing usage of BufferedReader to accept data from the user
*/

import java.io.*;

public class using_bufferredreader {
    public static void main(String args[]) throws IOException {
        
        InputStreamReader obj = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(obj);

        System.out.print("Enter a string : ");
        String s = br.readLine();

        System.out.print("Enter a integer : ");
        int i = Integer.parseInt(br.readLine());

        System.out.println("\nString : "+s+"\nInteger : "+i);

    }
}