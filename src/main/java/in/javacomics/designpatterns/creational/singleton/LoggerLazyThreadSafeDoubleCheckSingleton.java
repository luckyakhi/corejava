package in.javacomics.designpatterns.creational.singleton;

public class LoggerLazyThreadSafeDoubleCheckSingleton implements Logger{
	
	private volatile  static LoggerLazyThreadSafeDoubleCheckSingleton instance=null;
	private static int instanceCount;
	
	public static  LoggerLazyThreadSafeDoubleCheckSingleton getInstance(){
		if(instance == null){
			synchronized (LoggerLazyThreadSafeDoubleCheckSingleton.class) {
				if(instance == null){
					instance = new  LoggerLazyThreadSafeDoubleCheckSingleton();
					instanceCount++;
				}
			}
		}
		return instance;
	}
	
	public static int getInstanceCount(){
		return instanceCount;
	}
	
	@Override
	public void log(String message) {
		System.out.println(message);
	}
	
	
	
	private LoggerLazyThreadSafeDoubleCheckSingleton() {};

}
