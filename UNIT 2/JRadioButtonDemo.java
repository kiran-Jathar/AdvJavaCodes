import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JRadioButtonDemo extends JFrame implements ItemListener
{
	JRadioButton jcb1,jcb2,jcb3;
	JLabel L1;
	JRadioButtonDemo()
	{
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout();
		c.setLayout(f1);
		
		jcb1=new JRadioButton("Male");
		jcb2=new JRadioButton("Female");
		jcb3=new JRadioButton("Other",true);
		L1=new JLabel("												");
		ButtonGroup bg=new ButtonGroup();
		bg.add(jcb1);
		bg.add(jcb2);
		bg.add(jcb3);
		
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
				//L1.setText("You have Selected :"+jcb1.getText());
				JOptionPane.showMessageDialog(this,"You are Male");
		}
		else if(jcb2.isSelected())
		{
				//L1.setText("You have Selected :"+jcb2.getText());
				JOptionPane.showMessageDialog(this,"You are Female");

		}
		else if(jcb3.isSelected())
		{
				//L1.setText("You have Selected :"+jcb3.getText());
				JOptionPane.showMessageDialog(this,"You are Other");
		}
	}
	public static void main(String args[])
	{
		JRadioButtonDemo f1=new JRadioButtonDemo();
		f1.setVisible(true);
		f1.setTitle("JRadioButton Demo");
		f1.setSize(500,500);
	}
}