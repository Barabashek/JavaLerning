package Grow.Algorithmization.Decomposition;

// Найти все натуральные n-значные числа, цифры в которых образуют
// строго возрастающую последовательность (например, 1234, 5789). Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class TaskDecomposition15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
         int n = sc.nextInt();
        sc.close();
        System.out.println();
        numbersToInc(n);
    }
    public static void numbersToInc(int n){
     int minValue = (int) Math.pow(10, n);
     int maxValue = minValue * 10;
     int result = 0;
     while (minValue < maxValue){
        if (isInc(minValue)){
            result = minValue;
            System.out.println(result + " ");
            }
         minValue++;
        }
    }

    public static boolean isInc(int a){
        String str = Integer.toString(a);
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 1; i < array.length; i++){
            if (array[i] <= array[i - 1])
                return false;
        }
        return true;
    }
}