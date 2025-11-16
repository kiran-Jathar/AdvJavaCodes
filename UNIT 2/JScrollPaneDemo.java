//JScrollPane Control
import javax.swing.*;
import java.awt.*;
class JScrollPaneDemo extends JFrame 
{
	JScrollPaneDemo()
	{
		Container c=getContentPane();
		c.setLayout(new FlowLayout());
			
		JTextArea ta1=new JTextArea(20,25);
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane	jsp=new JScrollPane(ta1,v,h);
		c.add(jsp);
		
	}
	public static void main(String args[])
	{
		JScrollPaneDemo f1=new JScrollPaneDemo();
		f1.setVisible(true);
		f1.setTitle("My Frame");
		f1.setSize(500,500);
	}
}