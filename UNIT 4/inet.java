import java.net.*;
class inet
{
  public static void main(String args[])throws UnknownHostException
  {
    InetAddress addr=InetAddress.getLocalHost();
	System.out.println("Local Host"+addr);
	addr=InetAddress.getByName("msbte.org.in");
	System.out.println("getByName Method"+addr);
	InetAddress a[]=InetAddress.getAllByName("facebook.com");
	for(int i=0;i<a.length;i++)
	{
			System.out.println("getAllByName Method"+a[i]);

	}
	
  }
}