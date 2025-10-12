//Flow Layout Manager
import java.awt.*;
class FlowLayoutDemo extends Frame
{
		FlowLayoutDemo()
		{
			setBackground(Color.cyan);
			FlowLayout f1=new FlowLayout(FlowLayout.LEFT,50,50);
			setLayout(f1);
			Button b1=new Button("OK");
			Button b2=new Button("CANCEL");
			Button b3=new Button("RETRY");
			
			add(b1);
			add(b2);
			add(b3);
		}
		public static void main(String args[])
		{
			FlowLayoutDemo f1=new FlowLayoutDemo();
			f1.setVisible(true);
			f1.setTitle("FlowLayout Manager");
			f1.setSize(500,500);
		}
}
