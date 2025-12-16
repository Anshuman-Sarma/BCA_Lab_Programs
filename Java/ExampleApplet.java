// AnshumanSarma_WAP to demonstrate the life cycle of a Java Applet


/* <APPLET code = “ExampleApplet.class” WIDTH = 200 HEIGHT
= 150></APPLET> */
import java.applet.Applet;
import java.awt.Color;
import java.awt.Graphics;
public class ExampleApplet extends Applet{
String text;
public void init() {
setBackground(Color.white);
setForeground(Color.red);
text = “This is an example applet”;
System.out.println(“....Initialized the applet”);
}
public void start() {
System.out.println(“....Starting of the applet”);
}
public void stop() {
    System.out.println(“....Stopping the applet”);
    }
    public void destroy() {
    System.out.println(“....Exiting the applet”);
    }
    public void paint(Graphics g) {
    System.out.println(“....Painting the applet”);
    g.drawString(text, 30, 30);
    showStatus(“This is status bar”);
    }
    }