/*
WAP program to bank function.
*/
import java.util.*;

class Bank
{
  int accno;
  String cust_name;
  float balance;
  Scanner sc=new Scanner(System.in);
  void new_Acc_open()
  { 
  
     System.out.println("Enter Account Number:");
	 accno=sc.nextInt();
	 System.out.println("Enter Customer Name:");
	 cust_name=sc.next();
	 System.out.println("Enter AccountOpening balance(500-/):");
	 balance=sc.nextFloat();
  }
  void deposit()
  {
	  System.out.println("How Much Amount Do you Want To deposite:");
	 int deposit_amt=sc.nextInt();
	 balance=balance+deposit_amt;
	 System.out.println("Amount Deposited Scucessfully!!!");
	 
  }
  void withdraw()
  {	 
     System.out.println("How Much Amount Do you Want To withdraw:");
	 int withdraw=sc.nextInt();
	 balance=balance-withdraw;
	 System.out.println("Amount withdraw Scucessfully!!!");	 
  }
  void Account_info()
  {
     System.out.println("****************************************************");
     System.out.println("******************VJTECH BANK INDIA*****************");
     System.out.println("****************************************************");
	 System.out.println("Account No:"+accno);
	 System.out.println("Customer Name:"+cust_name);
	 System.out.println("Available Balance:"+balance);
  }
  public static void main(String args[])
  {
	    Bank b=new Bank();
		int ch;
	     do
		 {
		 Scanner sc=new Scanner(System.in);
		 System.out.println("*********BANK MENU**************");
		 System.out.println("1.New Account Open");
		 System.out.println("2.Deposite Amount");
		 System.out.println("3.Withdraw Amount");
		 System.out.println("4.Display Account information");
		 System.out.println("5.EXIT");
		 System.out.println("Enter Your Choice:");
		 ch=sc.nextInt();
		 switch(ch)
		 {
			 case 1:b.new_Acc_open();
					break;
			 case 2:b.deposit();
					break;
			 case 3:b.withdraw();
					break;
			 case 4:b. Account_info();
					break;
			 case 5:System.out.println("Thanks for banking with us!!!");
			        break;
			 default:System.out.println("Invalid Choice");
		 }
     }while(ch!=5);
  }
}
