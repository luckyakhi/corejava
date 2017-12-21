package in.javacomics.designpatterns.creational.factory;

import in.javacomics.designpatterns.creational.singleton.Logger;

public class ConsoleLoggerFactory implements LoggerFactory{

	@Override
	public Logger createLogger() {
		return new ConsoleLogger("1");
	}

}
