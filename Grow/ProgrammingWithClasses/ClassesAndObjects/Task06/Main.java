package Grow.ProgrammingWithClasses.ClassesAndObjects.Task06;

public class Main {
    public static void main(String[] args) {
        Time time = new Time(8, 20, 30);

        System.out.println("Time: " + time.printTime());
        System.out.println("Set second: 45");
        time.setSecond(45);
        System.out.println(time.printTime());

        System.out.println("Set new hour: 10");
        time.setNewHour(10);
        System.out.println(time.printTime());

        System.out.println("Set new second: 55");
        time.setNewSeconds(55);
        System.out.println(time.printTime());

        System.out.println("Set negative value of minutes: - 70");
        time.setNewMinutes(-70);
        System.out.println(time.printTime());

        System.out.println("Set negative value of minutes: - 120");
        time.setNewSeconds(-120);
        System.out.println(time.printTime());
    }
}
