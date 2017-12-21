package in.javacomics.io;


public class ProducerTask implements Runnable{
	private Producer<String> producer;

	public ProducerTask(Producer<String> producer) {
		super();
		this.producer = producer;
	}


	public void run(){
		producer.produce();
	}
}
