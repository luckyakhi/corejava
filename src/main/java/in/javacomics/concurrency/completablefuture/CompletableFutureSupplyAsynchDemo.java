package in.javacomics.concurrency.completablefuture;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.function.Supplier;

import static java.lang.Thread.sleep;

public class CompletableFutureSupplyAsynchDemo {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Supplier<String> nameSupplier = ()-> {
            try {
                System.out.println("Sleepting for 10 secs");
                sleep(10000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            return "Akhilesh";
        };
        CompletableFuture<String> completableFuture = CompletableFuture.supplyAsync(nameSupplier);
        System.out.println("Waiting on result");
        String result = completableFuture.get();//Blocking call
        System.out.println(result);
    }
}
