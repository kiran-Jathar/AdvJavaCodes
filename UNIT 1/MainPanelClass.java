//Panel...
import java.awt.*;
import java.awt.event.*;

class PanelDemo extends Panel
{	
	PanelDemo()
	{	
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		Label L1=new Label("This is panel Window");
		Button b1=new Button("Panel Button");
		add(L1);
		add(b1);
	}
}
class MainPanelClass extends Frame implements WindowListener
{
	MainPanelClass()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		Label L1=new Label("This is Frame window");
		Button b1=new Button("Frame Button");
		add(L1);
		add(b1);
		
		PanelDemo p1=new PanelDemo();
		add(p1);
		addWindowListener(this);
	}
	public void windowClosing(WindowEvent we)
	{
		dispose();
	}
	public void windowDeactivated(WindowEvent we){}
	public void windowActivated(WindowEvent we){}
	public void windowDeiconified(WindowEvent we){}
	public void windowIconified(WindowEvent we){}
	public void windowClosed(WindowEvent we){}
	public void windowOpened(WindowEvent we){}
	public static void main(String args[])
	{	
		MainPanelClass m1=new MainPanelClass();
		m1.setVisible(true);
		m1.setTitle("Frame Concept");
		m1.setSize(500,500);
	}
}
