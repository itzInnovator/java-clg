import java.awt.*;
import java.applet.*;

public class concentric_circle extends Applet {
    public void paint(Graphics g) {

        g.setColor(Color.YELLOW);
        g.fillOval(30, 50, 90,90);

        g.setColor(Color.BLUE);
        g.fillOval(40, 60, 70,70);

        g.setColor(Color.RED);
        g.fillOval(50, 70, 50, 50);

    }
}

/* 

<html>
    <applet code="concentric_circle.class" width=600 height=400> </applet>
</html

*/