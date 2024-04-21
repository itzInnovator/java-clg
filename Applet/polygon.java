import java.awt.*;
import java.applet.*;

public class polygon extends Applet {
    public void paint(Graphics g) {

        int x[] = {10, 10, 70, 10};
        int y[] = {30, 70, 70, 30};
        int numpoint = 3;

        g.drawPolygon(x, y, numpoint);

    }
    
}

/* 
 <html>
    <applet code = "polygon.class" width = 300 height = 300> </applet>
 </html>
*/