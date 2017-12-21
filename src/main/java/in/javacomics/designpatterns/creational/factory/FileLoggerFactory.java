package in.javacomics.designpatterns.creational.factory;

import in.javacomics.designpatterns.creational.singleton.Logger;

public class FileLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		return new FileLogger();
	}

}
