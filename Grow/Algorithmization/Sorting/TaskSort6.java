package Grow.Algorithmization.Sorting;

//Сортировка Шелла. Дан массив n действительных чисел. Требуется упорядочить его по возрастанию.
//Делается это следующим образом: сравниваются два соседних элемента ai и ai+1. Если ai <= ai+1, то продвигаются
//на один элемент вперед. Если ai > ai+1, то производится перестановка и сдвигаются на один элемент назад.
//Составить алгоритм этой сортировки.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskSort6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length");
        int n = sc.nextInt();

        int[] array = new int[n];
        arrayCreate(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        shellSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void shellSort(int[]array){
        for (int inc = array.length/2; inc >= 1; inc = inc/2)
            for (int step = 0; step < inc; step++)
                insertSort(array, step, inc);
    }
    private static void insertSort(int[] array, int start, int inc){
        int buff;
        for (int i = start; i < array.length-1; i += inc)
            for (int j = Math.min(i + inc, array.length - 1); j - inc >= 0; j = j - inc)
                if (array[j - inc] > array[j]){
                    buff = array[j];
                    array[j] = array[j - inc];
                    array[j - inc] = buff;
                }else
                    break;
    }
    public static int arrayRandomFill(){
        Random random = new Random();
        int randomNum = random.nextInt(47);
        return randomNum;
    }
    public static void arrayCreate(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = arrayRandomFill();
        }
    }
}
