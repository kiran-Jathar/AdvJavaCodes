//Login Page
import java.awt.*;
import java.awt.event.*;
class LoginPagedm extends Frame implements ActionListener
{
	Label L4;
	Button b1;
	TextField tf1,tf2;
	LoginPagedm()
	{
		setLayout(null);
		setBackground(Color.pink);
		Label L1=new Label("VJTECH SOFTWARE PVT LTD");
		L1.setForeground(Color.red);
		setForeground(Color.black);
		
		Label L2=new Label("Enter User Name:");
		Label L3=new Label("Enter Password:");
	    L4=new Label("				");
		L4.setForeground(Color.blue);
		
	    tf1=new TextField(30);
	    tf2=new TextField(30);
		tf2.setEchoChar('*');
		
	    b1=new Button("Login");
		
		Font f1=new Font("Arial black",Font.BOLD|Font.ITALIC,25);
		Font f2=new Font("Arial black",Font.BOLD,18);
		L1.setFont(f1);
		L2.setFont(f2);
		L3.setFont(f2);
		b1.setFont(f2);
		L4.setFont(f2);
		tf1.setFont(f2);
		tf2.setFont(f2);
		
		L1.setBounds(50,50,500,80);
		L2.setBounds(50,180,180,40);
		tf1.setBounds(260,180,160,40);
		L3.setBounds(50,260,180,40);
		tf2.setBounds(260,260,160,40);
		b1.setBounds(150,340,150,50);
		L4.setBounds(130,400,200,50);
		
		add(L1);
		add(L2);
		add(L3);
		add(tf1);
		add(tf2);
		add(b1);
		add(L4);
		b1.addActionListener(this);	
	}
	public void actionPerformed(ActionEvent ae)
	{
		String un=tf1.getText();
		String psw=tf2.getText();
		if(un.equals("VJTech")&&psw.equals("VJTech12"))
		{	
			L4.setText("Login Successful!!!");
		}
		else
		{
			L4.setText("Login Fail!!!");
		}
	}
	public static void main(String args[])
	{
	  LoginPagedm f1=new LoginPagedm();
	  f1.setVisible(true);
	  f1.setTitle("Login Form");
	  f1.setSize(500,500);
	}
}