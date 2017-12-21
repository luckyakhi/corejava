package in.javacomics.io;



import java.util.List;
import java.util.Queue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class QueueBasedMultiThreadedProcessor implements Processor<String>{
	private ExecutorService exectuorSvc;
	private Spliter<String> spliter;
	
	
	
	
	public QueueBasedMultiThreadedProcessor(Consumer<String> consumer, 
			Producer<String> producer,Spliter<String> spliter) {
		super();
		this.exectuorSvc = Executors.newFixedThreadPool(5);
		this.spliter=spliter;
	}



	@Override
	public void process(Queue<String> source) {
		List<Queue<String>> queues= spliter.split(source);
		for (Queue<String> queue : queues) {
			exectuorSvc.submit(new ProducerTask(new StaticQueueProducer(queue)));
			exectuorSvc.submit(new ConsumerTask(new StaticQueueConsumer(queue)));
		}
		exectuorSvc.shutdown();
	}

}
