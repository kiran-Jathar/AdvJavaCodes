//Parameterized Constructor 
import java.util.*;
class Book1
{
  int bookid;
  String name;
  float price;
  Book1(int id,String nm,float p)
  {
    bookid=id;
	name=nm;
	price=p;
  }
  void display()
  {
    System.out.println("Book ID:"+bookid);
	System.out.println("Book Name:"+name);
	System.out.println("Book price:"+price);
  }
  public static void main(String args[])
  {
    Book1 b1=new Book1(1010,"python",550.70f);
	b1.display();
  }
}

  
  
  
  
  
  