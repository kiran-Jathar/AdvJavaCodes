/*
Write a Java program to accept 5 teacher details and display teachers whose post is 
"HOD".
*/
import java.util.*;
class Staff
{
   int Staff_id;
   String name;
   String post;
   void getdata()
   {
     Scanner sc=new Scanner(System.in);
	 System.out.println("Enter Staff ID:");
	 Staff_id=sc.nextInt();
	 System.out.println("Enter Staff Name:");
	 name=sc.next();
	 System.out.println("Enter Staff post:");
	 post=sc.next();
	 
	}
	void putdata()
	{
	   if(post.equals("HOD"))
	   {
	     System.out.println(Staff_id+"\t"+name+"\t"+post);
	   }
	}
	public static void main(String args[])
	{
	   Staff s[]=new Staff[5];
      for(int i=0;i<5;i++)
	  {
		  s[i]=new Staff();
		  s[i].getdata();
	  }  
      System.out.println("=====================================================");
	  System.out.println("StaffID\tNAME\tPOST");
      System.out.println("=====================================================");
      for(int i=0;i<5;i++)
	  {
		  s[i].putdata();
	  }
	}
}
