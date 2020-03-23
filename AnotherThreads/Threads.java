package AnotherThreads;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Threads {
    public static List<Thread> threads = new ArrayList<>(5);

    static {
        threads.add(new Thread(new One()));
        threads.add(new Thread(new Two()));
        threads.add(new Thread(new Three()));
        threads.add(new Thread(new Four()));
        threads.add(new Thread(new Five()));
    }
    public static class One implements Runnable{

        @Override
        public void run() {
            while (true){}
        }
    }
    public static class Two implements Runnable{

        @Override
        public void run() {
            try {
                while (true){
                    Thread.sleep(1);
                }
            }catch (InterruptedException e){
                System.out.println("InterruptedException");
            }
        }
    }
    public static class Three implements Runnable{

        @Override
        public void run() {
           try { while (true){
               System.out.println("Ура");
                Thread.sleep(500);
               }
           }catch (InterruptedException e){Thread.currentThread().interrupt();}
        }
    }
    public static class Four extends Thread implements Message{
        private static volatile boolean stopped = true;
        @Override
        public void showWarning() {
            stopped = false;
        }

        @Override
        public void run() {
            while (stopped){}
        }
    }
    public static class Five implements Runnable {

        @Override
        public void run() {
            int result = 0;
            try (BufferedReader reader = new BufferedReader(new InputStreamReader(System.in))){
                    do {
                        String str = reader.readLine();
                        if (str.equals("N")){
                            System.out.println(result);
                            break;
                        }
                        result += Integer.parseInt(str);
                    } while (true);
            } catch (IOException e){
                e.printStackTrace();
                Thread.currentThread().interrupt();
            }
        }
    }
    public static void main(String[] args) {
    }
}