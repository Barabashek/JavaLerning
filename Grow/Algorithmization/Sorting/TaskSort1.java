package Grow.Algorithmization.Sorting;

//Заданы два одномерных массива с различным количеством элементов и натуральное число k. Объединить их в
//один массив, включив второй массив между k-м и (k+1) - м элементами первого, при этом не используя
//дополнительный массив.

import java.util.Arrays;
import java.util.Scanner;

public class TaskSort1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First array length");
        int firstLength = sc.nextInt();
        System.out.println("Input Second array length");
        int secondLength = sc.nextInt();
        System.out.println("Enter the index to insert");
        int k = sc.nextInt();
        sc.close();

        int[] firstArray = new int[firstLength];
        int[] secondArray = new int[secondLength];
        int[] fullArray = new int[firstLength + secondLength];

        for (int i = 0; i < firstArray.length; i++){
            firstArray[i] = (int) (Math.random()*50);
            System.out.print(firstArray[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < secondArray.length; i++){
            secondArray[i] = (int) (Math.random()*50);
            System.out.print(secondArray[i] + " ");
        }
        System.arraycopy(firstArray, 0, fullArray, 0, k);
        System.arraycopy(secondArray, 0, fullArray, k, secondArray.length);
        System.arraycopy(firstArray, k, fullArray, secondArray.length + k, firstArray.length-k);
        System.out.println();
        System.out.println(Arrays.toString(fullArray));
    }
}

