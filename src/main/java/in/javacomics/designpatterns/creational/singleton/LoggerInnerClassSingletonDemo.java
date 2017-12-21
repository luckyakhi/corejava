package in.javacomics.designpatterns.creational.singleton;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class LoggerInnerClassSingletonDemo {

	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {
		Logger logger = LoggerLazyThreadSafeSingleton.getInstance();
		logger.log("Test");
		for (Constructor<?> constructor : LoggerLazyThreadSafeSingleton.class.getDeclaredConstructors()) {
			constructor.setAccessible(true);
			Logger instance2 = (Logger) constructor.newInstance();
			System.out.println(logger==instance2);
		}

	}

}
