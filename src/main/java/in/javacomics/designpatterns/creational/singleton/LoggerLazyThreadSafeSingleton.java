package in.javacomics.designpatterns.creational.singleton;

public class LoggerLazyThreadSafeSingleton implements Logger{
	
	private static LoggerLazyThreadSafeSingleton instance;
	private static int instanceCount;
	
	public static synchronized LoggerLazyThreadSafeSingleton getInstance(){
		if(instance == null){
			try {
				// give other thead a chance
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new  LoggerLazyThreadSafeSingleton();
			instanceCount++;
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
	
	
	private LoggerLazyThreadSafeSingleton() {};

}
