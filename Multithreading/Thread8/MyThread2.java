package Thread8;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MyThread2 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis();
        ExecutorService executorService = Executors.newFixedThreadPool(9);
        for (int i = 0; i < 10; i++) {
            int finalI=i;
            executorService.submit( () -> {
                System.out.println(Thread.currentThread().getName()+ " working on number: "+ finalI);
                long result = factorial(finalI);
                System.out.println("Factorial of number : "+finalI+" is "+result);
            });
        }
        executorService.shutdown();
        try {
            while(!executorService.awaitTermination(1, TimeUnit.SECONDS)){
                System.out.println("Total time: "+ (System.currentTimeMillis() - startTime));
            }
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorService.close();
    }

    public static long factorial(int i){

        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        long result =1;
        for (int j = 1; j <=i ; j++) {
            result =result*(j);
        }
        return result;

    }
}
