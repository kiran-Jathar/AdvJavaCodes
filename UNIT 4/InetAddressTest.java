import java.net.*; 
class InetAddressTest 
{
 public static void main(String args[])throws UnknownHostException 
 {
	 int i=0;
 InetAddress SW[] =InetAddress.getAllByName("www.nba.com"); 
 for (i=0; i<SW.length;i++);
 System.out.println(SW[i]); 
 }
 }