package Lesson.Lesson25;


import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

public class Main {
   private BlockingQueue<String> drop;

   private final String DONE = "done";
   private final String[] messages = {
           "Мама пошла готовить обед",
           "Мама позвала к столу",
           "Дети кушают молочную кашу",
           "А что ест папа?"};

    public Main() {
        drop = new ArrayBlockingQueue<String>(1, true);
        (new Thread(new Producer())).start();
        (new Thread(new Consumer())).start();
    }
    class Producer implements Runnable{

        @Override
        public void run() {
            try{
                int cnt = 0;
                for (int i = 0; i < messages.length; i++){
                    drop.put(messages[i]);
                    if (++cnt < 3)
                        Thread.sleep(2000);
                }
                drop.put(DONE);
            } catch (InterruptedException e){
                System.err.println(e.getMessage());
            }
        }
    }
    class Consumer implements Runnable{
        @Override
        public void run() {
            try{
                String msg = null;
                while (!((msg = drop.take()).equals(DONE)))
                    System.out.println(msg);
            } catch (InterruptedException e){
                System.err.println(e.getMessage());
            }
        }
    }

    public static void main(String[] args) {
        new Main();
    }
}

