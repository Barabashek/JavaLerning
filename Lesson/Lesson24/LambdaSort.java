package Lesson.Lesson24;

import java.util.concurrent.*;

public class LambdaSort {
    public static void main(String[] args) throws ExecutionException, InterruptedException {
        Callable<String> task = () -> Thread.currentThread().getName();
        ExecutorService service = Executors.newFixedThreadPool(2);
        for (int i = 0; i < 5; i++){
            Future result = service.submit(task);
            System.out.println(result.get());
        }
        service.shutdown();
    }
}
