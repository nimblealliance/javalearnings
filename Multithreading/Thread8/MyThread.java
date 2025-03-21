package Thread8;

import java.util.List;
import java.util.concurrent.*;

public class MyThread {

    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        Future<Integer> future = executorService.submit(() -> 1+2);
        Future<?> future1 = executorService.submit(() -> System.out.println("Hello"));

        Callable<String> callable1 = () ->   {
            return "Hello";
        };

        Callable<String> callable2 = () ->   {
            return "World";
        };
        List<Callable<String>> list = List.of(callable1,callable2);

        List<Future<String>> futureList = executorService.invokeAll(list);
        for(Future<String> future3 : futureList){
            System.out.println(future3.get());
        }


        System.out.println(future.get());
        System.out.println(future1.get());
        executorService.shutdown();
    }
}