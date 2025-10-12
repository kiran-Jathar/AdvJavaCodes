//Comapare Two String array.

//INTERVEIEW QUESTIONS......

class compareStringArray
{

  public static void main(String args[])
  {
    String s1[]={"Pune","Thane","Nashik","Beed"};
	String s2[]={"Pune","Thane","Nashik","Beed"};
	int flag=0;
	for(int i=0;i<s1.length;i++)
	{
	  if(!(s1[i].equals(s2[i])))
	  {
	    flag=1;
		break;
	  }
	}
	if(flag==0)
	{
	  System.out.println("Both Array Elements Are Same!!!");
	}
	else
	{
	   System.out.println("Both Array Elements Are Not Same!!!");
	}
  }
}