//KeyEvent class and KeyListener interface...
import java.awt.*;
import java.awt.event.*;
class KeyEventDemo extends Frame implements KeyListener
{
	TextArea ta1;
	KeyEventDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		ta1=new TextArea(10,50);
		add(ta1);	
		ta1.addKeyListener(this);
	}
	public void keyPressed(KeyEvent ke)
	{
		ta1.setText("Key Pressed...!!!");
	}
	public void keyReleased(KeyEvent ke)
	{
		ta1.setText("Key Released...!!!");
	}
	public void keyTyped(KeyEvent ke)
	{
		ta1.setText("Key Typed...!!!");
	}
	public static void main(String args[])
	{
		KeyEventDemo k1=new KeyEventDemo();
		k1.setVisible(true);
		k1.setTitle("KeyEvent Demo"); 
		k1.setSize(500,500);
	}
}

