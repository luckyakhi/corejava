package in.javacomics.concurrency.leftovers;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.Callable;
import java.util.concurrent.CyclicBarrier;

import org.springframework.validation.beanvalidation.OptionalValidatorFactoryBean;

public class RowProcessor implements Callable<String>{
	private String[][] matrix;
	private CyclicBarrier cyclicBarrier;
	private int rowIndex;
	
	
	public RowProcessor(String[][] matrix, CyclicBarrier cyclicBarrier, int rowIndex) {
		super();
		this.matrix = matrix;
		this.cyclicBarrier = cyclicBarrier;
		this.rowIndex = rowIndex;
	}


	@Override
	public String call() {
		Optional<String> returnVal= Optional.of("ReturnValue");
		try {
			returnVal = Arrays.asList(matrix[rowIndex]).stream().max((x1,x2)->x1.compareTo(x2));
			cyclicBarrier.await();
		} catch (InterruptedException | BrokenBarrierException e) {
			e.printStackTrace();
		}
		return returnVal.orElse("NA");
	}

}
