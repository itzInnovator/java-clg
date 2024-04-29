import java.awt.*;
import java.applet.*;

public class roundrect extends Applet {
    public void paint(Graphics g) {

        g.drawRoundRect(30, 40, 100, 60, 30, 30);
        g.fillRoundRect(30, 120, 100, 60, 30, 30);

    }
}

/*
 <html>
    <applet code="roundrect.class" width=300 height=300> </applet>
 </html>
*/