package in.javacomics.networking;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetAddressDemo {

	public static void main(String[] args) throws UnknownHostException {
		InetAddress[] googleHost = InetAddress.getAllByName("www.google.com");
		for (InetAddress inetAddress : googleHost) {
			System.out.println(inetAddress);
		}
		
	}

}
