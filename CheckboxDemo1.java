import java.awt.*;
import java.awt.event.*;
class CheckboxDemo1 extends Frame implements ItemListener
{
	Checkbox c1,c2,c3;
	Label L1;
	CheckboxDemo1()
	{
		setLayout(null);
		setBackground(Color.orange);
		setForeground(Color.black);
		c1=new Checkbox("C Lang");
		c2=new Checkbox("C++ Lang");
		c3=new Checkbox("Java Lang");
		L1=new Label("");
		c1.setBounds(50,50,100,50);
		c2.setBounds(50,130,150,50);
		c3.setBounds(50,200,150,50);
		c1.setForeground(Color.red);
		c2.setForeground(Color.red);
		c3.setForeground(Color.red);
		L1.setForeground(Color.blue);
		Font f1=new Font("Arial Black",Font.BOLD,25);
		c1.setFont(f1);
		c2.setFont(f1);
		c3.setFont(f1);
		Font f2=new Font("Arial Black",Font.BOLD,20);
		L1.setFont(f2);
	    L1.setBounds(50,300,300,50);
		add(c1);
		add(c2);
		add(c3);
		add(L1);
		c1.addItemListener(this);
		c2.addItemListener(this);
		c3.addItemListener(this);	
	}
	public void itemStateChanged(ItemEvent ie)
	{	
		if(c1.getState())
		{
			L1.setText("You have Selected "+c1.getLabel());
		}
		else if(c2.getState())
		{
			L1.setText("You have Selected "+c2.getLabel());
		}
		else if(c3.getState())
		{
			L1.setText("You have Selected "+c3.getLabel());
		}
	}
	public static void main(String args[])
	{
		CheckboxDemo1 f1=new CheckboxDemo1();
		f1.setVisible(true);
		f1.setTitle("Checkbox Control");
		f1.setSize(500,500);
	}
}