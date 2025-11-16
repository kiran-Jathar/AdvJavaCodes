//JTree Class
import java.awt.*;
import javax.swing.*;
import javax.swing.tree.*;

class JTreeDemo extends JFrame 
{
	JTreeDemo()
	{
		Container c=getContentPane();
		BorderLayout b1=new BorderLayout();
		c.setLayout(b1);
		
		DefaultMutableTreeNode Lang=new DefaultMutableTreeNode("Language");
		DefaultMutableTreeNode L1=new DefaultMutableTreeNode("POP");
		DefaultMutableTreeNode L11=new DefaultMutableTreeNode("C Lang");
		DefaultMutableTreeNode L12=new DefaultMutableTreeNode("Pascal");
		DefaultMutableTreeNode L13=new DefaultMutableTreeNode("fortran");
		L1.add(L11);
		L1.add(L12);
		L1.add(L13);
		
		DefaultMutableTreeNode L2=new DefaultMutableTreeNode("OOP");
		DefaultMutableTreeNode L21=new DefaultMutableTreeNode("Java");
		DefaultMutableTreeNode L22=new DefaultMutableTreeNode("Python");
		DefaultMutableTreeNode L23=new DefaultMutableTreeNode("C++ Lang");
		L2.add(L21);
		L2.add(L22);
		L2.add(L23);
		
		Lang.add(L1);
		Lang.add(L2);
		
		JTree jt=new JTree(Lang);
		
		
		int v=ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS;
		int h=ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS;
		JScrollPane jsp=new JScrollPane(jt,v,h);
		
		c.add(jsp,BorderLayout.WEST);
		
	}
	public static void main(String args[])
	{	
		JTreeDemo f1=new JTreeDemo();
		f1.setVisible(true);
		f1.setTitle("JTree Demo");
		f1.setSize(500,500);
	}
}