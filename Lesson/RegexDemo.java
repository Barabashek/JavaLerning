package Lesson;

import java.util.Date;
import java.util.concurrent.CompletableFuture;
import java.util.concurrent.atomic.AtomicLong;
import java.util.function.Consumer;
import java.util.function.Function;

public class RegexDemo {
   public static void main(String[] args){
      AtomicLong atomicLong = new AtomicLong(0);
      Runnable task = () -> atomicLong.set(new Date().getTime());
      Function<Long, Date> dateConverter = (atomiclong) -> new Date(atomiclong);
      Consumer<Date> printer = date -> {
         System.out.println(date);
         System.out.flush();
      };

      CompletableFuture.runAsync(task)
              .thenApply((v) -> atomicLong.get())
              .thenApply(dateConverter)
              .thenAccept(printer);
   }
}