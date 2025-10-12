//creating frame in java

import java.awt.*;

class FrameDemo3 extends Frame
{
  FrameDemo3 (String str)
  {
   setBackground(Color.cyan);
   setForeground(Color.red);

  }
   public static void main(String args[])
  {
   FrameDemo3 fl=new FrameDemo3 ("My Frame");
   fl.setVisible(true); 
   fl.setSize (500, 500);
   }
 }