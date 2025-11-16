import java.awt.*;
import javax.swing.*;
//87654321
class StudentDemo extends JFrame
{
	StudentDemo()
	{
		Container c=getContentPane();
		c.setLayout(null);
		c.setBackground(Color.cyan);
		
		JLabel L1=new JLabel("****STUDENT FEEDBACK FORM****");
		L1.setBounds(150,30,500,50);
		c.add(L1);	
		Font f1=new Font("Arial black",Font.BOLD|Font.ITALIC,24);
		L1.setFont(f1);
		L1.setForeground(Color.red);
		
		Font f2=new Font("Arial black",Font.BOLD,20);
		
		JLabel L2=new JLabel("Enter Full Name:",JLabel.RIGHT);
		L2.setBounds(100,130,200,30);
		L2.setFont(f2);
		c.add(L2);	
		
		JTextField tf1=new JTextField(50);
		tf1.setBounds(300,130,200,30);
		c.add(tf1);
		
        JLabel L3=new JLabel("Enter Roll No:",JLabel.RIGHT);
		L3.setBounds(100,190,200,30);
		L3.setFont(f2);
		c.add(L3);	
		
		JTextField tf2=new JTextField(50);
		tf2.setBounds(300,190,200,30);
		c.add(tf2);	
		
		JLabel L4=new JLabel("Enter Mobile No:",JLabel.RIGHT);
		L4.setBounds(100,250,200,30);
		L4.setFont(f2);
		c.add(L4);	
		
		JTextField tf3=new JTextField(50);
		tf3.setBounds(300,250,200,30);
		c.add(tf3);

	    JLabel L5=new JLabel("Your Feedback:",JLabel.RIGHT);
		L5.setBounds(100,310,200,30);
		L5.setFont(f2);
		c.add(L5);	
		
		JTextArea tf4=new JTextArea(20,20);
		tf4.setBounds(300,310,200,100);
		c.add(tf4);
		
		JButton b1=new JButton("Submit Feedback");
		b1.setBounds(180,450,150,40);
		c.add(b1);
	}
	public static void main(String args[])
	{
		StudentDemo s1=new StudentDemo();
		s1.setVisible(true);
		s1.setTitle("Student Feedback Form");
		s1.setSize(800,700);
	}
}