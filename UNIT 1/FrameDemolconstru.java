//Write a Java program to create frame window. 
import java.awt.*;

class FrameDemolconstru extends Frame
{
  FrameDemolconstru (String title)
{
   super (title);

}



public static void main(String args[])

   {

   FrameDemolconstru fl=new FrameDemolconstru ("My Frame"); 
   fl.setVisible (true);

   fl.setSize(500, 500);
   }
 }