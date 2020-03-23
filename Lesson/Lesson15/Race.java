package Lesson.Lesson15;

import java.util.concurrent.CountDownLatch;

public class Race {
    private static final CountDownLatch START = new CountDownLatch(8);

    private static final int trackLenght  = 50000;

    public static void main(String[] args) throws InterruptedException{
        for (int i = 1; i <= 5; i++){
            new Thread(new Car(i, (int) (Math.random()* 100 + 50))).start();
            Thread.sleep(1000);
        }
        while (START.getCount() > 3)
            Thread.sleep(100);

        Thread.sleep(1000);
        System.out.println("To start");
        START.countDown();
        Thread.sleep(1000);
        System.out.println("Attention");
        START.countDown();
        Thread.sleep(1000);
        System.out.println("Go");
        START.countDown();
    }

    public static class Car implements Runnable{

        private int carNumber;
        private int carSpeed;

        public Car(int carNumber, int carSpeed) {
            this.carNumber = carNumber;
            this.carSpeed = carSpeed;
        }

        @Override
        public void run() {
            try{
                System.out.printf("Auto #%d run to start. \n", carNumber);

                START.countDown();

                START.await();
                Thread.sleep(trackLenght / carSpeed);
                System.out.printf("Auto #%d to finish!\n", carNumber);
            } catch (InterruptedException e){e.printStackTrace();}
        }
    }
}
