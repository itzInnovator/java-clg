/*
 * We'll be using the DataOutputStream and DataInputStream classes for this.
*/

import java.io.*;

public class character_writing {

    public static void main(String args[]) throws IOException {

        FileOutputStream fos = new FileOutputStream("testing.txt");
        DataOutputStream dos = new DataOutputStream(fos);
        FileInputStream fis = new FileInputStream("testing.txt");
        DataInputStream dis = new DataInputStream(fis);

        try {
            dos.writeUTF("Hey");
            dos.writeInt(420);
            dos.writeChar('e');
            dos.writeDouble(3.14);

            // Reading and Displaying the data we just recorded into the "testing.txt" file.
            System.out.println(dis.readUTF());
            System.out.println(dis.readInt());
            System.out.println(dis.readChar());
            System.out.println(dis.readDouble());

            fis.close();
            dis.close();
            dos.close();
            fos.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

    }
    
}
