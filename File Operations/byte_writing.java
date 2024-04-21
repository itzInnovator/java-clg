import java.io.*;

public class byte_writing {
    public static void main(String args[]) throws IOException {

        FileOutputStream fos = new FileOutputStream("testing.txt");

        byte b[] = {'h', 'i', ' ', 'c', 'h', 'a', 't'};

        try {
            fos.write(b);

            fos.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }

        System.out.println("Operation successful.");

    }
}
