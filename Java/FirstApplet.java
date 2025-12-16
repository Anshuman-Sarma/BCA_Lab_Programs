// AnshumanSarma_WAP to create a simple Java Applet that displays text


/* <APPLET code = "FirstApplet.class" WIDTH = 200 HEIGHT =
150></APPLET> */
import java.applet.*;
import java.awt.*;
public class FirstApplet extends Applet
    {
        public void paint(Graphics g)
        {
            g.drawString("This is my first applet program",     10,20);
        }
    }