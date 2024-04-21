import java.awt.*;
import java.applet.*;

public class displayingString extends Applet {
    public void paint(Graphics g) {

        g.drawString("Hello, Welcome to Applet!", 30, 40);

    }
}

/*
<html> 
    <applet code="displayingString.class" width=300 height=300> </applet>
</html>
*/