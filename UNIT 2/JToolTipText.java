//JToolTipText...
import javax.swing.*;
import java.awt.*;

class JToolTipText extends JFrame 
{
	JToolTipText()
	{	
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
		JButton b1=new JButton("VJTech Academy");
		b1.setToolTipText("This is Swing Button");
		c.add(b1);
	}
	public static void main(String args[])
	{	
		JToolTipText f1=new JToolTipText();
		f1.setVisible(true);
		f1.setTitle("JToolTipText Demo");
		f1.setSize(500,500);		
	}
}