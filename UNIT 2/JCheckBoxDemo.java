import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JCheckBoxDemo extends JFrame implements ItemListener
{
	JCheckBox jcb1,jcb2,jcb3;
	JLabel L1;
	JCheckBoxDemo()
	{
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout();
		c.setLayout(f1);
		jcb1=new JCheckBox("C Lang");
		jcb2=new JCheckBox("C++ Lang");
		jcb3=new JCheckBox("Java Lang",true);
		L1=new JLabel("												");
		c.add(jcb1);
		c.add(jcb2);
		c.add(jcb3);
		c.add(L1);
		jcb1.addItemListener(this);
		jcb2.addItemListener(this);
		jcb3.addItemListener(this);		
	}
	public void itemStateChanged(ItemEvent ie)
	{
		if(jcb1.isSelected())
		{
				L1.setText("You have Selected :"+jcb1.getText());
		}
		else if(jcb2.isSelected())
		{
				L1.setText("You have Selected :"+jcb2.getText());
		}
		else if(jcb3.isSelected())
		{
				L1.setText("You have Selected :"+jcb3.getText());
		}
	}
	public static void main(String args[])
	{
		JCheckBoxDemo f1=new JCheckBoxDemo();
		f1.setVisible(true);
		f1.setTitle("JCheckBox Demo");
		f1.setSize(500,500);
	}
}