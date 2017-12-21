package in.javacomics.designpatterns.creational.singleton;
public enum LoggerEnumSingleton implements Logger {
	logger;
	public void log(String message){
		System.out.println(message);
	}
}