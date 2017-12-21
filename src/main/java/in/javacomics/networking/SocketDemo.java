package in.javacomics.networking;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketAddress;

public class SocketDemo {

	public static void main(String[] args) throws IOException {
		try(Socket socket = new Socket()){
			SocketAddress endpoint = new InetSocketAddress("localhost", 8090);
			socket.connect(endpoint);
			socket.getOutputStream().write("Message".getBytes());
		}
	}

}
