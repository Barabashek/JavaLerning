package Grow.Algorithmization.Decomposition;

//Написать метод(методы) для вычисления суммы факториалов всех нечетных чисел от 1 до 9.

public class TaskDecomposition07 {
    public static void main(String[] args) {
        int summ = sumFac(9);
        System.out.println(summ);
    }
    public static int fac(int a){
        int res  = 1;
        for (int i = 1; i <= a; i++){
            res *= i;
        }
        return res;
    }
    public static int sumFac(int b){
        int summ = 0;
        for (int i = 1; i <= b; i++){
            if (i % 2 != 0)
                summ += fac(i);
        }
        return summ;
    }
}
