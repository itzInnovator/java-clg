import java.awt.*;
import java.applet.*;

public class working_w_fonts extends Applet {

    Font f;

    public void init(){
        f = new Font("times new roman", Font.BOLD, 20);
        setFont(f);
    }

    public void paint(Graphics g) {
        g.drawString("hello, this is a test", 20, 30);
    }
}

/*
 <html>
    <applet code="working_w_fonts.class" width=300 height=300> </applet>
 </html>
*/