//Button class
import java.awt.*; 
class ButtonDemo extends Frame
{
  ButtonDemo()
  {
  FlowLayout fl=new FlowLayout();
  setLayout (fl);
  Button bl=new Button("Login"); 
  Button b2=new Button ("Cancel");

  add (bl);

  add (b2);

}

public static void main(String args[])
  {
  ButtonDemo bl=new ButtonDemo (); 
  bl.setVisible (true);

  bl.setTitle("Button Demo");

  bl.setSize (600, 600);
  }
}