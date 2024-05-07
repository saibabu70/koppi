//java program that display the x and y position of the cursor movement using mouse import java.awt.*;
import java.awt.event.*;
 import java.applet.*;
/*<applet code="Exe14a" width=300 height=300>
</applet>*/
public class Exe14a extends Applet implements MouseListener,MouseMotionListener
{
String msg=" ";
int mousex=0,mousey=0;
 public void init()
{
addMouseListener(this);
 addMouseMotionListener(this);
}
public void mouseClicked(MouseEvent me)
{
mousex=0; mousey=10; msg="MouseClicked"; repaint();
}
public void mouseEntered(MouseEvent me)
{
mousex=0; mousey=10; msg="MouseEntered"; repaint();
}
public void mouseExited(MouseEvent me)
{
mousex=0; mousey=10; msg="MouseExited"; repaint();
}
public void mousePressed(MouseEvent me)
{
mousex=0; mousey=10; msg="down"; repaint();
}
public void mouseReleased(MouseEvent me)
{
mousex=me.getX(); mousey=me.getY(); msg="up"; repaint();
}
public void mouseDragged(MouseEvent me)
{
mousex=me.getX(); mousey=me.getY(); msg="*";
showStatus("Dragging mouse at:"+mousex+","+mousey); repaint();
}
public void mouseMoved(MouseEvent me)
{
mousex=me.getX(); mousey=me.getY();
showStatus("Moving mouse at:"+mousex+","+mousey);
}
public void paint(Graphics g)
{
g.drawString(msg,mousex,mousey);
}
}
