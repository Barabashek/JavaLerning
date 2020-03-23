package Grow.Algorithmization.OneDimensionalArrays;

// В массив A [N] занесены натуральные числа. Найти сумму тех элементов, которые кратны данному К.

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.print("Укажите длину массива: ");
        int n = new Scanner(System.in).nextInt();
        System.out.print("Введите некоторое число, меньше размера массива: ");
        int k = new Scanner(System.in).nextInt();
        int sum = 0;
        int[] naturalNumbers = new int[n];

        for (int i = 0; i < naturalNumbers.length; i++){
            naturalNumbers[i] = i;
            if (naturalNumbers[i] % k == 0){
                sum = sum + naturalNumbers[i];
            }
        }
        System.out.printf("Сумма элементов массива кратных числу %d равна %d.", k, sum);
    }
}
