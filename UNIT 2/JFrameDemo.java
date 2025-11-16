//JFrame Program...

import javax.swing.*;
class JFrameDemo extends JFrame
{
	JFrameDemo()
	{
			
	}
	public static void main(String args[])
	{
		JFrameDemo f1=new JFrameDemo();
		f1.setVisible(true);
		f1.setSize(500,500);
		f1.setTitle("JFrame Window");
		f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}