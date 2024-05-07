import java.applet.*; import java.awt.*;
public class Exe13c extends Applet
{
public void paint(Graphics g)
{
g.drawLine(10,10,50,50); 
g.drawRect(10,60,40,30); 
g.setColor(Color.blue); 
g.fillRect(60,10,30,80); 
g.setColor(Color.yellow); 
g.fillRoundRect(20,110,60,30,5,5); 
g.setColor(Color.red); 
g.drawString("Different shapes ",65,180);
 g.drawOval(230,10,200,150);
g.setColor(Color.blue); g.fillOval(245,25,100,100);
}
}
/*<applet code="Exe13c"width=500 height=400></applet>*/



