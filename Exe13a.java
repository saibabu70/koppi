/* JAVA program to paint like paint brush in applet*/ 
import java.awt.*;
import java.awt.event.*;
 import java.applet.*;
public class Exe13a extends Applet implements MouseMotionListener
{
public void init()
{
addMouseMotionListener(this); 
setBackground(Color.black);
}

public void mouseDragged(MouseEvent me){
     Graphics g=getGraphics();
      g.setColor(Color.white);
       g.fillOval(me.getX(),me.getY(),5,5);
}
public void mouseMoved(MouseEvent me){}


}
/*

<applet code="Exe13a.class" width="300" height="300">
</applet>
*/ 