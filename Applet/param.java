import java.awt.*;
import java.applet.*;

public class param extends Applet {

    Font f;

    public void init() {
        f = new Font("Arial", Font.BOLD, 20);
        setFont(f);
    }

    public void paint(Graphics g) {
        String username = getParameter("u");
        g.drawString("Hello "+username+"!", 20, 30);
    }
}

/* 
 <html>
    <applet code="param.class" width=300 height=300>
        <param name="u" value="Skididi">
    </applet>
 </html>
*/
