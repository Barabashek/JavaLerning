package Grow.Algorithmization.Sorting;

//Сортировка выбором. Дана последовательность чисел a1 <= a2 <= ... <= an .Требуется переставить элементы так,
//чтобы они были расположены по убыванию. Для этого в массиве, начиная с первого, выбирается наибольший
//элемент и ставится на первое место, а первый - на место наибольшего. Затем, начиная со второго, эта процедура
//повторяется. Написать алгоритм сортировки выбором.

import java.util.Arrays;
import java.util.Scanner;

public class TaskSort3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First array length");
        int n = sc.nextInt();

        int[] array = new int[n];
        for (int i = 0; i < array.length; i++) {
            array[i] = n * i;
            System.out.print(array[i] + " ");
        }
        selectionSort(array);
        System.out.println();
        System.out.println(Arrays.toString(array));
    }

    public static void selectionSort (int[] array){
        int max, temp, manyIndex;

        for (int i = 0; i < array.length-1; i++){
            max = array[i];
            manyIndex = i;
            for (int j = i + 1; j < array.length; j++){
                if (max < array[j]){
                    max = array[j];
                    manyIndex = j;
                }
            }
            temp = array[i];
            array[i] = max;
            array[manyIndex] = temp;
        }
    }
}
