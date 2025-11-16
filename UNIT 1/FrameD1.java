//creating frame in java 
import java.awt.*;
class FrameD1 extends Frame
{
  public void paint (Graphics g)
 {
  setBackground (Color.cyan);
  setForeground (Color.red); 
  g.drawString ("Welcome to VJTech Academy",150,250);
}

public static void main(String args[])
 {
  FrameD1 dl=new FrameD1();
  dl.setVisible (true);
  dl.setSize(500, 500); 
  dl.setTitle("My Frame");
 }
}