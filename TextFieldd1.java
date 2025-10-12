//TextField Demo

import java.awt.*; 
class TextFieldd1 extends Frame
{
   TextFieldd1()
  {
    FlowLayout fl=new FlowLayout(); 
    setLayout(f1);
    setBackground(Color.cyan);
    setForeground(Color.red);
    TextField L1=new TextField(30);
    TextField L2=new TextField("America");
    TextField L3=new TextField("China",30);
	L1.setEchoChar('*');
    add(L1);
    add(L2); 
    add(L3);
  }

  public static void main(String args[])
  {
    TextFieldd1 fl=new TextFieldd1();
    fl.setVisible(true);
    fl.setSize(500,500);
    fl.setTitle("Hello");
  }
 }