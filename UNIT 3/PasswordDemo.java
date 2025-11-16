import java.awt.*;
import java.awt.event.*;

class PasswordDemo  extends Frame implements ActionListener
{
	TextField tf1;
	Button b1;
	PasswordDemo()
	{
	   setLayout(new FlowLayout());
	   tf1=new TextField(20);
	   b1=new Button("See Password");
	   tf1.setEchoChar('*');
	   add(tf1);
	   add(b1); 
	   b1.addActionListener(this);   
	}
	public void actionPerformed(ActionEvent ae)
	{
		String str=ae.getActionCommand();
		if(str.equals("See Password"))
		{
			tf1.setEchoChar('\0');
			b1.setLabel("Hide password");
		}
		if(str.equals("Hide Password"))
		{
			tf1.setEchoChar('*');
			b1.setLabel("See password");
		}
	}
	public static void main(String args[])
	{
		PasswordDemo p1=new PasswordDemo();
		p1.setTitle("Password Demo");
		p1.setSize(700,700);
		p1.setVisible(true);
	}

}