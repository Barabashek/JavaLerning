package Grow.Algorithmization.Decomposition;

// Из заданного числа вычли сумму его цифр. Из результата вновь вычли сумму его цифр и т.д.
// Сколько таких действий надо произвести, чтобы получился нуль? Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class TaskDecomposition17 {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        countIterable(n);
    }
    public static void countIterable(int n){
        int summ = sumElements(n);
        int count = 0;
        while (n >= 0){
            n -= summ;
            count++;
        }
        System.out.println(count);
    }
    public static int sumElements(int n){
        int summ = 0;
        String str = Integer.toString(n);
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < array.length; i++){
            summ += array[i];
        }
        return summ;
    }
}
