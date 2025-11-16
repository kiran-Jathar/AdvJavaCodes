//JProgrssBar Class
import javax.swing.*;
import java.awt.*;

class JProgressBarDemo extends JFrame 
{
	JProgressBar jpb;
	JProgressBarDemo()
	{	
		Container c=getContentPane();
		setLayout(null);
		
	    jpb=new JProgressBar(0,3000);
		jpb.setStringPainted(true);
		jpb.setBounds(120,150,200,40);
		jpb.setValue(1000);
		
		c.add(jpb);
	}
	void setProgressBarValue()
	{
		int i=0;
		while(i<=3000)
		{
			jpb.setValue(i);
			i=i+20;
			try
			{	
				Thread.sleep(100);
			}
			catch(Exception e){}
		}
	}
	public static void main(String args[])
	{	
		JProgressBarDemo f1=new JProgressBarDemo();
		f1.setVisible(true);
		f1.setTitle("JProgrssBar Demo");
		f1.setSize(500,500);
		
		f1.setProgressBarValue();
		
	}
}