package in.javacomics.designpatterns.creational.singleton;

import java.io.Serializable;

public class LoggerLazySingleton implements Logger,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6901218525307982031L;
	private static LoggerLazySingleton instance;
	private static int instanceCount;
	
	public static LoggerLazySingleton getInstance(){
		if(instance == null){
			try {
				// give other thead a chance
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new  LoggerLazySingleton();
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
	
	
	private LoggerLazySingleton() {};

}
