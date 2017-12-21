package in.javacomics.designpatterns.creational.factory;

import in.javacomics.designpatterns.creational.singleton.Logger;

public class ConsoleLogger implements Logger{
	
	private String logLevel;

	public ConsoleLogger(String logLevel) {
		super();
		this.logLevel = logLevel;
	}


	@Override
	public void log(String message) {
		System.out.println("Logging to console");
	}

}
