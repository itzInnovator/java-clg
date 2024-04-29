import java.awt.*;
import java.applet.*;

public class working_w_fonts extends Applet {

    Font f;
    String str, fname, ffamily;
    int size, style;

    public void init(){
        f = new Font("times new roman", Font.BOLD, 20);
        setFont(f);

        fname = f.getFontName();    // Returns font name
        ffamily = f.getFamily();    // Returns font family
        size = f.getSize();         // Returns font size
        style = f.getStyle();       // Returns font style
        str = f.getName();          // Returns fonts logical name
        
    }

    public void paint(Graphics g) {
        g.drawString("Font Name : "+fname, 60, 44);
        g.drawString("Font Family : "+ffamily, 60, 77);
        g.drawString("Font Size : "+size, 60, 110);
        g.drawString("Font Style : "+style, 60, 140); // 0 - PLAIN , 1 - BOLD , 2 - ITALIC
        g.drawString("Font's Logical name : "+str, 60, 170);

    }
}

/*
 <html>
    <applet code="working_w_fonts.class" width=600 height=400> </applet>
 </html>
*/