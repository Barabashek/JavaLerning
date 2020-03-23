package Grow.Algorithmization.OneDimensionalArrays;

//Дана последовательность действительных чисел а1 ,а2 ,..., ап. Заменить все ее члены, большие данного Z, этим
//числом. Подсчитать количество замен.

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        double n = new Scanner(System.in).nextInt();
        double z = new Scanner(System.in).nextInt();
        double[]arr = new double[(int) n];
        int count = 0;

        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
            System.out.print(arr[i] + " ");
            if (arr[i] > z){
                arr[i] = z;
                count++;
            }
        }
        System.out.println();
        for (double a : arr){
            System.out.print(a + " ");
        }
        System.out.println();
        System.out.println(count);
    }
}
