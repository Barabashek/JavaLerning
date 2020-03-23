package Grow.Algorithmization.OneDimensionalArrays;

//Дан целочисленный массив с количеством элементов п. Сжать массив, выбросив из него каждый второй
//элемент (освободившиеся элементы заполнить нулями). Примечание. Дополнительный массив не использовать.

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {
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
        System.out.println(Arrays.toString(arrayElementReplace(arr)));
    }
    public static int [] arrayElementReplace(int[] array){
        int elem = 0;
        for (int i = 0; i < array.length; i += 2){
            array[elem] = array[i];
            elem++;
        }
        Arrays.fill(array, elem, array.length, 0);
        return array;
    }
}