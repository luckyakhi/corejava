package in.javacomics.io;


public class ConsumerTask implements Runnable{
	private Consumer<String> consumer;

	public ConsumerTask(Consumer<String> consumer) {
		super();
		this.consumer = consumer;
	}

	@Override
	public void run(){
		consumer.consume();
	}

}
