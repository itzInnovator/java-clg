import java.awt.*;
import java.applet.*;

public class smiley_face extends Applet {
    public void paint(Graphics g){
        
        g.drawOval(30, 40, 65, 80);
        g.drawOval(47, 63, 10, 8);
        g.drawOval(67, 63, 10, 8);

        g.drawArc(48, 73, 30, 30, 190, 175);

    }
}

/*
 <html>
    <applet code="smiley_face.class" width=300 height=300> </applet> 
 </html>
*/