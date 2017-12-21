package in.javacomics.concurrency.cyclicbarrier;

import java.util.Arrays;
import java.util.Optional;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CyclicBarrier;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

import in.javacomics.concurrency.leftovers.RowProcessor;

public class MaximumInMatrixCyclicBarrier {

	public static void main(String[] args) {
		String[][] nameMatrix = {{"Akhilesh","Amit","Arnab","Ashutosh","Pavanesh"},{"Alfred","Alex","Robert","Olivia","Michale"}};
		CyclicBarrier cyclicBarrier = new CyclicBarrier(3);
		RowProcessor firstRowMaxFinder = new RowProcessor(nameMatrix, cyclicBarrier , 0);
		RowProcessor secondRowMaxFinder = new RowProcessor(nameMatrix, cyclicBarrier , 1);
		ExecutorService executorService = Executors.newFixedThreadPool(2);
		Future<String> firstRowMaxFuture = executorService.submit(firstRowMaxFinder);
		Future<String> secondRowMaxFuture = executorService.submit(secondRowMaxFinder);
		executorService.shutdown();
		try {
			cyclicBarrier.await();
			String firstRowMax = firstRowMaxFuture.get();
			String secondRowMax = secondRowMaxFuture.get();
			Optional<String> ultimateMax = Arrays.asList(new String[]{firstRowMax,secondRowMax}).stream().max((a1,a2)->a1.compareTo(a2));
			System.out.println("Utlimate name is:"+ultimateMax.orElse("Not found"));
		} catch (InterruptedException | BrokenBarrierException e) {
			System.err.println("Main Thread Wait errored Out");
		} catch (ExecutionException e) {
			System.err.println("Error occured while getting future:"+e.getCause());
		}
		
	}

}
