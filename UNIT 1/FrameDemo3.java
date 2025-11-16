//creating frame in java 
import java.awt.*;


class FrameD1 extends Frame
{
public void paint (Graphics g)
{
setBackground (Color.cyan);
 setForeground (Color.red); 
 g.drawstring ("Welcome to VJTech Academy",150,250);

}

public static void main(String args[])
{
FrameD1 fl=new FrameD1();

fl.setVisible (true);

fl.setSize(500, 500); 
fl.setTitle("My Frame");
}}