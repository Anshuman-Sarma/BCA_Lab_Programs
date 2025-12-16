// AnshumanSarma_WAP to draw a filled oval using Java Applet


/* <APPLET code = “FillOval.class” WIDTH = 200 HEIGHT =
200></APPLET> */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class FillOval extends Applet{
public void paint(Graphics g) {
g.setColor(Color.red);
g.fillOval(20, 20, 60, 60);
}
}