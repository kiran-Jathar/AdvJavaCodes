import java.awt.*;
import javax.swing.*;

class JComboBoxDemo extends JFrame
{
	JComboBoxDemo()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		
		JComboBox jcb=new JComboBox();
		jcb.addItem("C Lang");
		jcb.addItem("c++ Lang");
		jcb.addItem("Java Lang");
		jcb.addItem("Python Lang");
		jcb.addItem("Android Lang");
		jcb.addItem("Data Structure");
		
		c.add(jcb);
	}
	public static void main(String args[])
	{
		JComboBoxDemo s1=new JComboBoxDemo();
		s1.setVisible(true);
		s1.setTitle("Student Feedback Form");
		s1.setSize(800,700);
	}
}