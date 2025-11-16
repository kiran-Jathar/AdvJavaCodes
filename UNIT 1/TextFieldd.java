//TextField Demo

import java.awt.*; 
class TextFieldd extends Frame
{
   TextFieldd()
  {
    FlowLayout sl=new FlowLayout(); 
    setLayout(s1);
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
    TextFieldd fl=new TextFieldd();
    fl.setVisible(true);
    fl.setSize(500,500);
    fl.setTitle("Hello");
  }
 }