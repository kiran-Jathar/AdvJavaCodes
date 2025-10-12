//Checkbox Demo...
import java.awt.*;
class CheckboxDemo extends Frame
{
  Button b1,b2,b3;
  CheckboxDemo()
  {
	FlowLayout f1=new FlowLayout();
	setLayout(f1);
	setBackground(Color.cyan);
	setForeground(Color.black);
	
	Checkbox c1=new Checkbox("India",true);
	Checkbox c2=new Checkbox("America");
	Checkbox c3=new Checkbox("China");
	
	add(c1);
	add(c2);
	add(c3);
  }
  public static void main(String args[])
  {	
	CheckboxDemo f1=new CheckboxDemo();
	f1.setVisible(true);
	f1.setSize(800,800);
	f1.setTitle("CheckBox Demo");
  }
}