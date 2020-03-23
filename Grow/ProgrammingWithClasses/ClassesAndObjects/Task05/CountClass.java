package Grow.ProgrammingWithClasses.ClassesAndObjects.Task05;

// Опишите класс, реализующий десятичный счетчик, который может увеличивать
// или уменьшать свое значение на единицу в заданном диапазоне. Предусмотрите
// инициализацию счетчика значениями по умолчанию и произвольными значениями.
// Счетчик имеет методы увеличения и уменьшения состояния, и метод позволяющее
// получить его текущее состояние. Написать код, демонстрирующий все возможности класса.

public class CountClass {
    private int counter;

    public CountClass(){
        this.counter = 0;
    }

    public CountClass(int counter) {
        if (counter > 100 || counter < 0)
            counter = 0;
        else
            this.counter = counter;
    }

    public int getCounter() {
        return this.counter;
    }

    public void setCounter(int counter) {
        this.counter = counter;
    }

    public void increment(){
        counter++;
        if (counter == 100){
            System.out.println("This is max value");
        } else if (counter > 100) {
            System.out.println("This value > 100");
            counter--;}
    }
    public void decrement(){
        counter--;
        if (counter == 100)
            System.out.println("This is max value");
        else if (counter < 0) {
            System.out.println("This value < 0");
            counter++;}
    }
}
