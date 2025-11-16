//Choice Control...
import java.awt.*;
import java.awt.event.*;

class ChoiceDemo extends Frame implements  ItemListener
{	
	Choice c1;
	Label L1;
	ChoiceDemo()
	{
		setLayout(new FlowLayout());
		setBackground(Color.cyan);
		c1=new Choice();
		L1=new Label("																					");
		c1.add("Selected Item");
		c1.add("India");
		c1.add("America");
		c1.add("China");
		c1.add("Shrilanka");
		
		add(c1);
		add(L1);
		c1.addItemListener(this);
	}
	public void itemStateChanged(ItemEvent ie)
	{
		String str=c1.getSelectedItem();
		L1.setText("You have Selected Item :"+str);
	}
	public static void main(String args[])
	{
		ChoiceDemo f1=new ChoiceDemo();
		f1.setVisible(true);
		f1.setTitle("Choice Control");
		f1.setSize(500,500);
	}
}


