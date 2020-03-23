package Grow.Algorithmization.OneDimensionalArrays;

//Даны действительные числа а1 ,а2 ,..., аn . Поменять местами наибольший и наименьший элементы.

import java.util.Arrays;

public class Task4 {
    public static void main(String[] args) {
        double[] arr = {-10,2, 30, -12, 3, -175, 6, 132, 0, 0, 13, 246, 57};
        int minIndex = 0;
        int maxIndex = 0;
        double max = arr[maxIndex];
        double min = arr[minIndex];
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
            if (max < arr[i]){
                max = arr[i];
                maxIndex = i;
            } if (min > arr[i]){
                min = arr[i];
                minIndex = i;
            }
        }
        double tm = arr[maxIndex];
        arr[maxIndex] = arr[minIndex];
        arr[minIndex] = tm;
        System.out.println();
        for (double num : arr)
            System.out.print(num + " ");
        System.out.println();
        System.out.println( min + " " + max);
    }
}
