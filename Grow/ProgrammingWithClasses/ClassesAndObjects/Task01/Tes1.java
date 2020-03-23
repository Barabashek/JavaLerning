package Grow.ProgrammingWithClasses.ClassesAndObjects.Task01;

// Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих переменных.
// Добавьте метод, который находит сумму значений этих переменных, и метод, который находит наибольшее значение из этих двух переменных.

public class Tes1 {
    private int a;
    private int b;

    public void printValue(){
        System.out.printf("a = %d, b = d%", a, b);
    }
    public void setA(int a) {
        this.a = a;
    }

    public void setB(int b) {
        this.b = b;
    }
    public int summ(){
        return a + b;
    }
    public int compare(){
        if (a > b)
            return a;
        else
            return b;
    }
}
