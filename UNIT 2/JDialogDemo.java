//JDialog...
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class JDialogDemo extends JFrame implements ActionListener
{
    JButton b1;
	JDialogDemo()
	{	
		Container c=getContentPane();
		FlowLayout f1=new FlowLayout();
		c.setLayout(f1);
		b1=new JButton("Display Dialog box");
		b1.addActionListener(this);
		c.add(b1);
	}
	public void actionPerformed(ActionEvent ae)
	{
		JDialog jd=new JDialog(this,"DialogBox",true);
		jd.add(new JButton("OK"));
		jd.setSize(150,150);
		jd.setVisible(true);
	}
	public static void main(String args[])
	{	
		JDialogDemo f1=new JDialogDemo();
		f1.setVisible(true);
		f1.setTitle("JDialogDemo Demo");
		f1.setSize(500,500);		
	}
}