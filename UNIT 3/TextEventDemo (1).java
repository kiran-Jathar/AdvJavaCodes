//TextEvent class and TextListener interface 
import java.awt.*;
import java.awt.event.*;
class TextEventDemo extends Frame implements TextListener
{
	TextField tf1;
	Label L1,L2;
	TextEventDemo()
	{
		FlowLayout f1=new FlowLayout();
		setLayout(f1);
		
		tf1=new TextField(30);
		L1=new Label("							");
		L2=new Label("												");

		add(tf1);
		add(L1);
		add(L2);
		tf1.addTextListener(this);
	}
	public void textValueChanged(TextEvent te)
	{
		L1.setText("Typing...");
		L2.setText(tf1.getText());
	}
	public static void main(String args[])
	{
		TextEventDemo t1=new TextEventDemo();
		t1.setVisible(true);
		t1.setTitle("TextEvent Demo");
		t1.setSize(500,500);
	}
}