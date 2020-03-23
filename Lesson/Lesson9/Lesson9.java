package Lesson.Lesson9;


public class Lesson9 {
    public static void main(String[] args) {
        Bicycle bicycle = new Bicycle("Stell", 120, 40);
        Bicycle.Seat seat = bicycle.new Seat();

        seat.getSeatParam();
    }
    }