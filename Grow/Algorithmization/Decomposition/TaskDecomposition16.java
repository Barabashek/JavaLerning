package Grow.Algorithmization.Decomposition;

//Написать программу, определяющую сумму n - значных чисел, содержащих только нечетные цифры.
//Определить также, сколько четных цифр в найденной сумме. Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class TaskDecomposition16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        summOddNumber(n);
    }
    public static void summOddNumber(int n){
        int minValue = (int) Math.pow(10, n);
        int maxValue = minValue * 10;
        long result = 0;
        for (int i = minValue; i < maxValue; i++){
            if (isOdd(i))
                result += minValue;
            minValue++;
        }
        System.out.println("Summa = " + result);
        isEven(result);
    }
    public static boolean isOdd(int num){
        String str = Integer.toString(num);
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0 || array[i] == 0) return false;
        }
        return true;
    }
    public static void isEven(long num){
        String str = Long.toString(num);
        int[] array = new int[str.length()];
        for (int i = 0; i < str.length(); i++){
            array[i] = Integer.parseInt(String.valueOf(str.charAt(i)));
        }
        int count = 0;
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0 && array[i] != 0)
                count++;
        }
        System.out.println("Quantity of even numbers = " + count);
    }
}
