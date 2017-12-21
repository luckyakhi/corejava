package in.javacomics.designpatterns.creational.factory;

import in.javacomics.designpatterns.creational.singleton.Logger;

public class FileLogger implements Logger{

	@Override
	public void log(String message) {
		System.out.println("Logging to file");
		
	}

}
