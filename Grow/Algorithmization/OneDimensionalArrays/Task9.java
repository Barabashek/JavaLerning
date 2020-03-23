package Grow.Algorithmization.OneDimensionalArrays;

//В массиве целых чисел с количеством элементов n найти наиболее часто встречающееся число. Если таких
//чисел несколько, то определить наименьшее из них.

import java.util.Scanner;

public class Task9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * n));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        findMather(arr);
    }
    public static void findMather(int[] array){
        int[] math = new int[array.length];
        int globalCounter = 0;
        for (int i = 0; i < array.length; i++) {
            int number = array[i];
            int counter = 0;
            for (int j = 0; j < array.length; j++) {
                if (array[j] == number) {
                    counter++;
                }
            }
            math[i] = counter;
            if (counter > globalCounter) {
                globalCounter = counter;
            }
        }

        int result = Integer.MAX_VALUE;
        for (int i = 0; i < math.length; i++) {
            if (math[i] == globalCounter && array[i] < result) {
                result = array[i];
            }
        }

        System.out.println(result);
    }
}
