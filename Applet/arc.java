import java.awt.*;
import java.applet.*;

public class arc extends Applet {
    public void paint(Graphics g){

        g.drawArc(30, 40, 100, 100, 0, 200);
        g.fillArc(30, 160, 100, 100, 0, 200);

    }
}

/*
 <html>
    <applet code="arc.class" width=300 height=300> </applet>
 </html>
*/