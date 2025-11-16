//Inet Address
import java.net.*;
class InetAddressDemo 
{
	public static void main(String args[])throws UnknownHostException
	{
		InetAddress addr=InetAddress.getLocalHost();
		System.out.println("Local Host Name:"+addr);
		addr=InetAddress.getByName("msbte.org.in");
		System.out.println("getByName Method Output:"+addr);
		InetAddress a[]=InetAddress.getAllByName("www.facebook.com");
		System.out.println("Is Multicast Address="+addr.isMulticastAddress());
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
	}
}
/*
OUTPUT:
Local Host Name:dell/192.168.138.42
getByName Method Output:msbte.org.in/43.240.64.241
Is Multicast Address=false
www.facebook.com/157.240.242.35
www.facebook.com/2a03:2880:f16e:81:face:b00c:0:25de
*/