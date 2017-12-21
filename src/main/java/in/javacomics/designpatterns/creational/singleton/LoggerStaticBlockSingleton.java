package in.javacomics.designpatterns.creational.singleton;

public class LoggerStaticBlockSingleton implements Logger {
	private static LoggerStaticBlockSingleton instance;
	static{
		try{
			instance = new LoggerStaticBlockSingleton();
		}catch(Exception ex){
			System.err.println("Error occured in initalization");
		}
	}
	private LoggerStaticBlockSingleton(){};
	
	public LoggerStaticBlockSingleton getLogger(){
		return instance;
	}
	@Override
	public void log(String message) {
		System.out.println(message);
		
	}
}
