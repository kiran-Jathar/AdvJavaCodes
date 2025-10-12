//ButtonDemo
import java.awt.*;
class buttondemo1 extends Frame
{
  buttondemo1()
  {
  FlowLayout f1=new FlowLayout();
  setLayout(f1);
  Button b1=new Button("OK");
  Button b2=new Button("Cancle");
  Button b3=new Button("Retry");
  add(b1);
  add(b2);
  add(b3);

  }
  public static void main(String args[])
  {
    buttondemo1 f1=new buttondemo1();
	f1.setVisible(true);
	f1.setSize(500,500);
	f1.setTitle("Welcome Tejas");
  }
}