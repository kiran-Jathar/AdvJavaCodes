//Color Demo Examplpe...
import java.awt.*;
import java.awt.event.*;
class ColorGenDemo22 extends Frame implements ActionListener
{
  Button b1,b2,b3;
  ColorGenDemo22()
  {
	FlowLayout f1=new FlowLayout();
	setLayout(f1);
	
	b1=new Button("Yellow");
	b2=new Button("Green");
	b3=new Button("Pink");
	
	add(b1);
	add(b2);
	add(b3);
	
	b1.addActionListener(this);
	b2.addActionListener(this);
	b3.addActionListener(this);
  }
  public void actionPerformed(ActionEvent ae)
  {
	 if(ae.getSource()==b1)
	 {
		setBackground(Color.yellow);
	 }
	 else if(ae.getSource()==b2)
	 {
		setBackground(Color.green);
	 }
	 else if(ae.getSource()==b3)
	 {
		setBackground(Color.pink);
	 }
  }
  public static void main(String args[])
  {	
	ColorGenDemo22 f1=new ColorGenDemo22();
	f1.setVisible(true);
	f1.setSize(800,800);
	f1.setTitle("Color Demo");
  }
}