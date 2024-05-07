//java program that identifies key_up key_down event user entering text in a Applet import java.awt.*;
import java.awt.event.*; import java.applet.*;
/*<applet code="Exe14b"width=300 height=400>
</applet>
*/
public class Exe14b extends Applet implements KeyListener
{
int X=20,Y=30;
String msg="KeyEvents";
public void init()
{
addKeyListener(this); requestFocus(); setBackground(Color.black); setForeground(Color.white);
}
public void keyPressed(KeyEvent k)
{
showStatus("KeyDown"); int key=k.getKeyCode(); switch(key)
{
case KeyEvent.VK_UP:showStatus("Move to Up"); break;
case KeyEvent.VK_DOWN:showStatus("Move to Down"); break;
case KeyEvent.VK_LEFT:showStatus("Move to Left"); break;
case KeyEvent.VK_RIGHT:showStatus("Move to right"); break;
}
repaint();
}
public void keyReleased(KeyEvent k)
{
showStatus("key up");
}
public void keyTyped(KeyEvent k)
{
msg+=k.getKeyChar(); repaint();
}
public void paint(Graphics g)
{
g.drawString(msg,X,Y);
}
}
