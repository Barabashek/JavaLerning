package Grow.Algorithmization.Decomposition;

// Даны натуральные числа К и N. Написать метод(методы)
// формирования массива А, элементами которого являются числа,
// сумма цифр которых равна К и которые не большее N.

import java.util.Arrays;
import java.util.Scanner;

public class TaskDecomposition12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int K = sc.nextInt();
        int N = sc.nextInt();
        sc.close();

        int[] mass = fillArray(K, N);
        System.out.println(Arrays.toString(mass));
    }
    public static int[] fillArray(int k, int n){
        int[] array = new int[20];
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            int num = (int) Math.round(Math.random()*100);
            sum += num;
            if (num < n && sum <= k)
                array[i] = num;
        }
        return array;
    }
}
