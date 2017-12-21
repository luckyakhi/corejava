package in.javacomics.io;

import java.io.Closeable;
import java.io.IOException;

public class CloseableDemo implements Closeable {
	public static void main(String[] args) throws IOException {
		try(CloseableDemo cd = new CloseableDemo()){
			System.out.println("Working on resource");
		}
	}

	@Override
	public void close() throws IOException {
		System.out.println("Closing the resource");
		
	}
}
