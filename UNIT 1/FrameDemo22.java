//creating frame in java

import java.awt.*;

class FrameDemo22 extends Frame
{
  FrameDemo22 (String str)
  {
   super(str);
  }
   public static void main(String args[])
  {
   FrameDemo22 fl=new FrameDemo22 ("My Frame");
   fl.setVisible(true); 
   fl.setSize (500, 500);
   }
 }