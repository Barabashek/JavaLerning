package Grow.Algorithmization.Sorting;

//Сортировка обменами. Дана последовательность чисел a1 <= a2 <= ... <= an. Требуется переставить числа в
//порядке возрастания. Для этого сравниваются два соседних числа ai и ai+1. Если ai > ai+1 , то делается
//перестановка. Так продолжается до тех пор, пока все элементы не станут расположены в порядке возрастания.
//Составить алгоритм сортировки, подсчитывая при этом количества перестановок.

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TaskSort4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input array length");
        int n = sc.nextInt();

        int[] array = new int[n];
        arrayCreate(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        bubbleSort(array);
    }

    public static void bubbleSort(int[] array){
        int count = 0;
        int buff;
        for (int i = 0; i < array.length - 1; i++){
            for (int j = 0; j < array.length - i -1; j++){
                if (array[j] > array[j + 1]){
                 buff = array[j];
                 array[j] = array[j + 1];
                 array[j + 1] = buff;
                 count++;
                }
            }
        }
        System.out.println(Arrays.toString(array));
        System.out.println(count);
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
