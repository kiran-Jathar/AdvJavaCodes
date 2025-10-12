//Copy Constructor 
import java.util.*;
class Book2
{
  int bookid;
  String name;
  float price;
  Book2(int id,String nm,float p)
  {
    bookid=id;
	name=nm;
	price=p;
  }
  Book2(Book2 m)
  {
	bookid=m.bookid;
	name=m.name;
	price=m.price;
  }
  void display()
  {
    System.out.println("Book ID:"+bookid);
	System.out.println("Book Name:"+name);
	System.out.println("Book price:"+price);
  }
  public static void main(String args[])
  {
    Book2 b1=new Book2(1010,"python",550.70f);
	Book2 b2=new Book2(b1);
	System.out.println("***********Object b1**************");
	b1.display();
   System.out.println("***********Object b2**************");
    b2.display();
  }
}

  
  
  
  
  
  