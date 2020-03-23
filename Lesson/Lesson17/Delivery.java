package Lesson.Lesson17;

import java.util.concurrent.Exchanger;

public class Delivery {
    private static final Exchanger<String> EXCHANGER = new Exchanger<>();

    public static void main(String[] args) throws InterruptedException{
        String[] p1 = new String[]{"{посылка A->D}", "{посылка A->C}"};
        String[] p2 = new String[]{"{посылка B->C}", "{посылка B->D}"};

        new Thread(new Truck(1, "A", "D", p1)).start();
        Thread.sleep(100);
        new Thread(new Truck(2, "B", "C", p2)).start();

    }

    public static class Truck implements Runnable{
        private int number;
        private String dep;
        private String dest;
        private String[] parcels;

        public Truck(int number, String dep, String dest, String[] parcels) {
            this.number = number;
            this.dep = dep;
            this.dest = dest;
            this.parcels = parcels;
        }

        @Override
        public void run() {
            try{
                System.out.printf("В грузовик №%d погрузили: %s и %s.\n", number, parcels[0], parcels[1]);
                System.out.printf("Грузовик №%d выехал из пункта %s в пункт %s.\n", number, dep, dest);
                Thread.sleep(1000 + (long) Math.random() * 5000);
                System.out.printf("Грузовик №%d приехал в пункт Е.\n", number);
                parcels[1] = EXCHANGER.exchange(parcels[1]);
                System.out.printf("В грузовик №%d переместили посылку для пункта %s.\n", number, dest);
                Thread.sleep(1000 + (long) Math.random() * 5000);
                System.out.printf("Грузовик №%d приехал в %s и доставил: %s и %s.\n", number, dest, parcels[0], parcels[1]);
            } catch (InterruptedException e){e.printStackTrace();}
        }
    }
}
