import java.awt.*;
import java.awt.event.*;

class SquareDemo extends Frame implements ActionListener,MouseListener
{
	Label L1,L2;
	TextField tf1,tf2;
	Button b1;
	SquareDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		setBackground(Color.cyan);
		
		L1=new Label("Enter Number:");
		L2=new Label("Result:");
		tf1=new TextField(20);
		tf2=new TextField(20);
		b1=new Button("Find Square");
		
		add(L1);add(tf1);
		add(L2);add(tf2);
		add(b1);
		
		b1.addActionListener(this);
		tf1.addMouseListener(this);
		tf2.addMouseListener(this);
		
	}
	public void actionPerformed(ActionEvent ae)
	{	
		int no=Integer.parseInt(tf1.getText());
		int result=no*no;
		tf2.setText(result+"");
		
	}
	public void mouseEntered(MouseEvent me)
	{
		tf1.setText("");
		tf2.setText("");
	}
	public void mouseExited(MouseEvent me){}
	public void mouseReleased(MouseEvent me){}
	public void mousePressed(MouseEvent me){}
	public void mouseClicked(MouseEvent me){}
	public static void main(String args[])
	{
		SquareDemo s1=new SquareDemo();
		s1.setVisible(true);
		s1.setTitle("Frame Window");
		s1.setSize(500,500);
		
	}
}