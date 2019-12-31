package in.javacomics.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

import static java.lang.Thread.sleep;

public class CompletableFutureCompleteDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
      final CompletableFuture<String> completableFuture = new CompletableFuture<>();
      Thread t = new Thread(new CompletableFutureCompleteDemo.Task(completableFuture));
      t.start();
      System.out.println("Main thread is waiting for result");
      String result=completableFuture.get();
      System.out.printf("Result is %s \n",result);
    }
    private static class Task implements Runnable{
        private CompletableFuture<String> completableFuture;

        public Task(CompletableFuture<String> completableFuture) {
            this.completableFuture = completableFuture;
        }

        @Override
        public void run() {
            try {
                Thread.sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            completableFuture.complete("Akhilesh");
        }
    }
}
