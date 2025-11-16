import java.net.*;
class URLDemo1
{
public static void main(String args[])throws MalformedURLException
{
 URL u1=new URL("https://vjtechacademy.in:7/about-us");
 System.out.println("Protocol"+u1.getProtocol());
}}