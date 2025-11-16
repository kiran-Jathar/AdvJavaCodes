//Default Constructor 
import java.util.*;
class Book
{
  int bookid;
  String name;
  float price;
  Book()
  {
    Scanner sc=new Scanner(System.in);
	System.out.println("Enter Book Id");
	bookid=sc.nextInt();
	System.out.println("Enter Book Name:");
	name=sc.next();
	System.out.println("Enter Book Price:");
	price=sc.nextFloat();
   
  }
  void display()
  {
    System.out.println("Book ID:"+bookid);
	System.out.println("Book Name:"+name);
	System.out.println("Book price:"+price);
  }
  public static void main(String args[])
  {
	Book b=new Book();
	b.display();
  }
}

  
  
  
  
  
  