//JFrame Program-1
import javax.swing.*;
class JFrameDemo1 extends JFrame
{
	JFrameDemo1(String str)
	{
		super(str);
	}
	public static void main(String args[])
	{
		JFrameDemo1 f1=new JFrameDemo1("VJTech Academy");
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("JFrame Window");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}