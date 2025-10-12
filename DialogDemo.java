//Model dialog box.
import java.awt.*;

class DialogDemo extends Frame
{
	public static void main(String args[])
	{
	  DialogDemo d1=new DialogDemo();
	  d1.setVisible(true);
	  d1.setTitle("Model Dialog Box");
	  d1.setSize(500,500);
	  
	  Dialog DB=new Dialog(d1,false);
	  DB.setLayout(new FlowLayout());
	  DB.add(new Button("Yes"));
	  DB.add(new Button("No"));
	  DB.add(new Button("Cancel"));
	  DB.setVisible(true);
	  DB.setSize(300,300); 
	}
}