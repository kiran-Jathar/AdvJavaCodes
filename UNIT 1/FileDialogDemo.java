//File Dialog box
import java.awt.*;
import java.awt.event.*;

class FileDialogDemo extends Frame implements ActionListener
{	
	Button b1,b2;
	FileDialogDemo()
	{
		setLayout(new FlowLayout());
		b1=new Button("Open File Dialog");
		b2=new Button("Save File Dialog");
		b1.addActionListener(this);
		b2.addActionListener(this);
		add(b1);
		add(b2);
	}
	public void actionPerformed(ActionEvent ae)
	{
		if(ae.getSource()==b1)
		{	
			FileDialog fd=new FileDialog(this,"VJTech Open",FileDialog.LOAD);
			fd.setVisible(true);
		}
		else
		{
		    FileDialog fd1=new FileDialog(this,"VJTech Save",FileDialog.SAVE);
			fd1.setVisible(true);
		}
	}
	public static void main(String args[])
	{
		FileDialogDemo f1=new FileDialogDemo();
		f1.setVisible(true);
		f1.setTitle("FileDialog Demo");
		f1.setSize(500,500);
	}
}