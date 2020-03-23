package Grow.ProgrammingWithClasses.ClassesAndObjects.Task05;

public class TestCount {
    public static void main(String[] args) {
        CountClass count = new CountClass();
        System.out.println(count.getCounter());
        System.out.println("count.decrement: ");
        count.decrement();

        System.out.println("Method increment");
        for (int i = 1; i < 100; i++)
            count.increment();
        System.out.println("Value count = " + count.getCounter());
        System.out.println("value count after start increment method: ");
        count.increment();
        System.out.println("Value count = " + count.getCounter());
        count.increment();
        System.out.println("Value count = " + count.getCounter());

        CountClass countTwo = new CountClass(10);
        System.out.println("Value count = " + countTwo.getCounter());
        System.out.println("Method decrement: ");
        countTwo.decrement();

        for (int i = 1; i < 8; i++)
            countTwo.increment();

        System.out.println("Value count = " + countTwo.getCounter());
    }
}
