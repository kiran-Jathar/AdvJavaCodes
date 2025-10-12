//Label Demo

import java.awt.*; 
class LabelDemo1 extends Frame
{
   LabelDemo1 ()
  {
    FlowLayout fl=new FlowLayout(); 
    setLayout(f1);
    setBackground (Color.cyan);
    setForeground (Color.red);
    Label L1=new Label("India");
    Label L2=new Label("America");
    Label L3=new Label("China");
    add (L1);
    add (L2); 
    add (L3);
  }

public static void main(String args[])
  {
    LabelDemo1 fl=new LabelDemo1 ();
    fl.setVisible(true);
    fl.setSize(500,500);
    fl.setTitle("Hello");
  }
 }