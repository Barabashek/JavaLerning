package Lesson.Lessons;



public class Lesson1 {
    public static void main(String[] args) {
        Clock clock = new Clock();
        Thread clockThread = new Thread(clock);
        clockThread.start();

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        clockThread.interrupt();
    }
    static class Clock implements Runnable{
        public void run(){
            Thread current = Thread.currentThread();

            while (!current.isInterrupted()){
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("Tik");
            }
        }
    }
}