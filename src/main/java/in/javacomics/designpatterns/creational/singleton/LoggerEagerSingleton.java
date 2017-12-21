package in.javacomics.designpatterns.creational.singleton;

public class LoggerEagerSingleton implements Logger{
	private static LoggerEagerSingleton instance = new LoggerEagerSingleton();
	public static LoggerEagerSingleton getLogger(){
		return instance;
	}
	private LoggerEagerSingleton(){};
	
	public void log(String message){
		System.out.println(message);
	}
}
