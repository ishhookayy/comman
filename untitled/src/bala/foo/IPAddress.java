package bala.foo;

import java.net.*;
public class IPAddress
{
    public static void main(String[] args)
    {
        try
        {
            InetAddress IP = InetAddress. getLocalHost();
            System. out. println("IP of my system is := "+IP. getHostAddress());
            System. out. println("IP of my system is := "+IP. getHostName());
        }
        catch (UnknownHostException e)
        {
            System.out.println("Not Found IP Address");
        }
    }
}
