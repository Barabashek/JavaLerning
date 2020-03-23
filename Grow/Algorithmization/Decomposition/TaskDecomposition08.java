package Grow.Algorithmization.Decomposition;

// Задан массив D. Определить следующие суммы:
// D[l] + D[2] + D[3]; D[3] + D[4] + D[5]; D[4] +D[5] +D[6].
// Пояснение. Составить метод(методы) для вычисления суммы трех
// последовательно расположенных элементов массива с номерами от k до m.

import java.util.Arrays;
import java.util.Scanner;

public class TaskDecomposition08 {
    public static void main(String[] args) {
        int[] array = new int[15];
        int k;
        for (int i = 0; i < array.length; i++) array[i] = (int) Math.round(Math.random() * array.length - 1);
        System.out.println(Arrays.toString(array));
        Scanner sc= new Scanner(System.in);
        k = sc.nextInt();
        if (k > array.length) return;
        sc.close();
        int result = summThreeElement(array, k);
        System.out.println(result);
    }
    public static int summThreeElement(int[] array, int k){
        int summ = 0;
        for (int i = 0; i < array.length; i++){
            summ = array[k] + array[k + 1] + array[k + 2];
        }
        return summ;
    }
}
