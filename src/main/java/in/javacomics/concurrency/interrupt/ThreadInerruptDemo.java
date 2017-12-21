package in.javacomics.concurrency.interrupt;
class ThreadInerruptDemo{
    public static void main(String args[]) throws Exception{
        Runnable interruptedPrinter = () -> {
           while(!Thread.currentThread().isInterrupted()) {
               System.out.println("Running");
           }
           System.out.printf("Thread %s interrupted state: %s isAlive:%s \n",Thread.currentThread().getName(),Thread.currentThread().isInterrupted(),
					Thread.currentThread().isAlive());
        };
        Thread thread = new Thread(interruptedPrinter);
        thread.start();
        Thread.sleep(1000);
        thread.interrupt();
    }
   
}