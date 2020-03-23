package Lesson.Lesson9;

public class Bicycle {
    private String model;
    private int weight;

    private int seatPostDiameter;

    public Bicycle(String model, int weight, int seatPostDiameter) {
        this.model = model;
        this.weight = weight;
        this.seatPostDiameter = seatPostDiameter;

    }

    public void start() {
        System.out.println("Поехали!");
    }

    protected class Seat {

        public void up() {

            System.out.println("Сиденье поднято выше!");
        }

        public void down() {

            System.out.println("Сиденье опущено ниже!");
        }

        public void getSeatParam() {

            System.out.println("Параметр сиденья: диаметр подседельного штыря = " + Bicycle.this.seatPostDiameter);
        }
    }
}