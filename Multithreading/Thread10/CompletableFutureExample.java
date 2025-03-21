package Thread10;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class CompletableFutureExample {

    public static void main(String[] args) {

        ExecutorService executorService = Executors.newFixedThreadPool(5);

        CompletableFuture<Object> completableFuture = CompletableFuture.supplyAsync(() -> {

            try {
                Thread.sleep(100);
                System.out.println("Worker Thread" + Thread.currentThread().getName());
            } catch (Exception e) {

            }
            return "Sup";
        },executorService);
                //.thenApply( boo -> boo + " "+boo +"!");

        executorService.shutdown();

        try {
            System.out.println(completableFuture.get());
        } catch (InterruptedException | ExecutionException e) {
            throw new RuntimeException(e);
        }

        System.out.println("Main");
    }
}
