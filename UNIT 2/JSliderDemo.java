//JSlider...
import javax.swing.*;
import java.awt.*;

class JSliderDemo extends JFrame 
{
	JSliderDemo()
	{	
		Container c=getContentPane();
		c.setLayout(null);
		JSlider js=new JSlider(0,200,50);
		js.setBounds(150,150,180,40);
		js.setMinorTickSpacing(50);
		js.setMajorTickSpacing(100);
		js.setPaintTicks(true);
		js.setPaintLabels(true);
		js.setPaintTrack(true);
		c.add(js);
	}
	public static void main(String args[])
	{	
		JSliderDemo f1=new JSliderDemo();
		f1.setVisible(true);
		f1.setTitle("JSliderDemo Demo");
		f1.setSize(500,500);		
	}
}