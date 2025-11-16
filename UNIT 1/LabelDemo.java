//Label Control

import java.awt.*;

class LabelDemo extends Frame
{
  LabelDemo ()
  {
   //FlowLayout fl=new FlowLayout(FlowLayout.LEFT); //label set in left side
   setLayout (null);
   setBackground(Color.cyan);
   setForeground(Color.red);

   Label L1=new Label ("India");
   Label L2=new Label ("America"); 
   Label L3=new Label();
   L3.setText("China");     //set text method use
   L1.setBounds(100,100,110,60);
   L2.setBounds(100,160,110,60);
   L3.setBounds(100,240,110,60);


   add (L1);
   add (L2); 
   add (L3);
  }

public static void main(String args[])
 {
  LabelDemo ld=new LabelDemo();
  ld.setVisible (true);
  ld.setTitle("Label Demo");
  ld.setSize(500, 500);
  }
}