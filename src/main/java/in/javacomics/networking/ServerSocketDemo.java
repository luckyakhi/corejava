package in.javacomics.networking;

import java.io.IOException;
import java.net.ServerSocket;

public class ServerSocketDemo {

	public static void main(String[] args) throws IOException {
		try (ServerSocket serverSocket = new ServerSocket(8090)) {
			serverSocket.accept();
			System.out.println("Message Rcvd");

		}

	}

}
