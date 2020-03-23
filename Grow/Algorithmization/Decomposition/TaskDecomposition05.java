package Grow.Algorithmization.Decomposition;

//  Составить программу, которая в массиве A[N] находит второе по величине число
// (вывести на печать число, которое меньше максимального элемента массива, но больше всех других элементов).

import java.util.Arrays;
import java.util.Scanner;

public class TaskDecomposition05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter massive length");
        int n = sc.nextInt();
        sc.close();

        int array[] = new int[n];
        for (int i = 0; i < array.length; i++) {array[i] = (int) Math.round(Math.random() * n);}

        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        //sc.close();
        int result = findSecondMoreElement(array);
        System.out.println(result);
    }
    private static int findSecondMoreElement(int[] array){
        int secondElement = 0;
        int biggestElement = findFirstMoreElement(array);
        for (int i = 0; i < array.length; i++){
            int some = 0;
            if (some < array[i]) some = array[i];
            if (some < biggestElement) secondElement = some;
        }
        return secondElement;
    }
    private static int findFirstMoreElement(int[] array){
        int moreElement = 0;
        for (int i = 0; i < array.length; i++){
            if (moreElement < array[i])
                moreElement = array[i];
        }
        return moreElement;
    }
}
