//JTable
import javax.swing.*;
import java.awt.*;
class JTableDemo extends JFrame
{
	JTableDemo()
	{
		Container c=getContentPane();
		
		String colHeads[]={"RollNo","Name","Marks"};
		String data[][]={
							{"1010","Dennis","89.90"},
							{"2020","Bajarne","67.89"},
							{"3030","James","34.78"},
							{"	4040","Yang","11.45"}
						};
						
		JTable jt=new JTable(data,colHeads);
				
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_AS_NEEDED;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED;
		
		JScrollPane jsp=new JScrollPane(jt,v,h);
		c.add(jsp);
	}
	public static void main(String args[])
	{
		JTableDemo f1=new JTableDemo();
		f1.setVisible(true);
		f1.setTitle("My Frame");
		f1.setSize(500,500);
	}
}