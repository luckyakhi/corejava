package in.javacomics.designpatterns.creational.singleton;

import java.io.Serializable;

public class LoggerLazySingletonWithReadResolve implements Logger,Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 6901218525307982031L;
	private static LoggerLazySingletonWithReadResolve instance;
	private static int instanceCount;
	
	public static LoggerLazySingletonWithReadResolve getInstance(){
		if(instance == null){
			try {
				// give other thead a chance
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			instance = new  LoggerLazySingletonWithReadResolve();
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
	
	public Object readResolve(){
		return instance;
	}
	
	private LoggerLazySingletonWithReadResolve() {};

}
