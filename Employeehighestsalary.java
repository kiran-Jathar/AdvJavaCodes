 /*
Write a java Lang Program To Accept Five Employee Details And Display Second 
Highest Salary Employee Details.

EmPID NAME    SALARY
1010  Dennis  15000
2020  James   18000
3030  Bajrne  9000
4040  Brenden 13500
5050  Yang    95000
------------------------

output:
EmPID NAME    SALARY
-----------------------
2020 James    18000
*/
import java.util.*;
class Employeehighestsalary
{
   int empid;
   String name;
   int salary;
   void get_emp_details()
   {
      Scanner sc=new Scanner(System.in);
	  System.out.println("Enter Employee Id:");
	  empid=sc.nextInt();
      System.out.println("Enter Employee Name:");
	  name=sc.next(); 
	  System.out.println("Enter Employee salary:");
	  salary=sc.nextInt();
	}
	void disp_emp_details()
	{
	   System.out.println(empid+"\t"+name+"\t"+salary);
	}
	public static void main(String args[])
	{
	  Employee e[]=new Employee[5];
	  System.out.println("Enter Five Employee Details:");
	  for(int i=0;i<5;i++)
	  {
	    e[i]=new Employee();
		e[i].get_emp_details();
      }
	  Employee temp1=e[0];
	  for(int i=1;i<5;i++)
	  {
		  if(e[i].salary>temp1.salary)
		  {
			  temp1=e[i];
		  }
	  }  
	  Employee temp2=e[0];
	  for(int i=1;i<5;i++)
	  {
		  if(e[i].salary>temp2.salary&&e[i].salary<temp1.salary)
		  {
			  temp2=e[i];
		  }
	  }
	  System.out.println("\n---------------------------");
      System.out.println("EmPID\tNAME\tSALARY");
	  System.out.println("\n---------------------------");
	  temp2.disp_emp_details(); 
	}
}