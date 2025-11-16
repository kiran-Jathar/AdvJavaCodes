//List Control
import java.awt.*;
import java.awt.event.*;

class ListDemo extends Frame implements ActionListener
{
	List L1,L2;
	Button b1;
	Label L3,L4;
	ListDemo()
	{
		setLayout(null);
		setBackground(Color.pink);
	    L1=new List(3);
		L1.add("C Lang");
		L1.add("C++ Lang");
		L1.add("Java Lang");
		L1.add("Python Lang");
		L1.add("Android Lang");
		L1.add("PHP Lang");
		
		L2=new List(5,true);
		L2.add("India");
		L2.add("China");
		L2.add("America");
		L2.add("Pakistan");
		L2.add("Afaganisthan");
		L2.add("Australia");
		
		L3=new Label("															");
		L4=new Label("															");
		b1=new Button("Show Selected Items");
		L1.setBounds(50,70,100,50);
		L3.setBounds(180,70,300,50);
		L2.setBounds(50,200,100,50);
		L4.setBounds(180,200,300,50);
		b1.setBounds(50,300,150,50);
		
		add(L1);add(L3);
		add(L2);add(L4);
		add(b1);
		b1.addActionListener(this);
	}
	public void actionPerformed(ActionEvent ae)
	{
		String lang=L1.getSelectedItem();
		String country[]=L2.getSelectedItems();
		L3.setText("Selected Lang:"+lang);
		String str="";
		for(int i=0;i<country.length;i++)
		{
			str=str+country[i]+",";
		}
		L4.setText(str);
	}
	public static void main(String args[])
	{
		ListDemo f1=new ListDemo();
		f1.setVisible(true);
		f1.setTitle("List Control");
		f1.setSize(500,500);
	}
}