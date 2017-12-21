package in.javacomics.designpatterns.creational.singleton;

public class LoggerInnerClassSingleton implements Logger{

	@Override
	public void log(String message) {
		System.out.println(message);
	}
	
	public static LoggerInnerClassSingleton getInstance(){
		return LoggerHolder.instance;
	}
	
	private LoggerInnerClassSingleton(){};
	private static class LoggerHolder{
		public static LoggerInnerClassSingleton instance = new LoggerInnerClassSingleton();
	}

}

