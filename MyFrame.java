//Displaying information within frame window. 
import java.awt.*;

class MyFrame extends Frame
{
  public void paint (Graphics g)
  {
  setForeground (Color.red);
  setBackground (Color.cyan);
  g.drawString ("This is my frame",150,170); 
  }
  public static void main(String args[])
  {
    MyFrame ml=new MyFrame(); 
    ml.setSize(500,500);
    ml.setVisible(true); 
	ml.setTitle("VTech Academy");
	}
}