package in.javacomics.concurrency.exchanger;

import java.util.UUID;
import java.util.concurrent.Callable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CriteriaBasedFilter implements Callable<String>{
	private final static Logger log = LoggerFactory.getLogger(CriteriaBasedFilter.class);
	private String taskName;
	
	public CriteriaBasedFilter(String taskName) {
		super();
		this.taskName = taskName;
	}

	@Override
	public String call() throws Exception {
		while(true){
			log.info(Thread.currentThread().getName()+":running task:"+taskName);
			return UUID.randomUUID().toString();
		}
		
	}

}
