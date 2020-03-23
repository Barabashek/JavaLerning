package Grow.Algorithmization.Sorting;

//Пусть даны две неубывающие последовательности действительных чисел a1 <= a2<= ... <= an и b1<= b2 <= ... <= bm.
//Требуется указать те места, на которые нужно вставлять элементы последовательности b1<= b2 <= ... <= bm в первую
//последовательность так, чтобы новая последовательность оставалась возрастающей.

import java.util.Arrays;
import java.util.Scanner;

public class TaskSort7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First array length");
        int n = sc.nextInt();
        System.out.println("Input Second array length");
        int m = sc.nextInt();

        int [] arrayOne = new int[n];
        int [] arrayTwo = new int[m];

        for (int i = 0; i < n; i ++) arrayOne[i] = (int) (Math.random() * 40);
        for (int i = 0; i < m; i ++) arrayTwo[i] = (int) (Math.random() * 100);

        Arrays.sort(arrayOne);
        Arrays.sort(arrayTwo);

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));
        System.out.println();
        int[] fullArray = insertArrayToArray(arrayOne, arrayTwo);
        System.out.println(Arrays.toString(fullArray));
    }
    public static int[] insertArrayToArray(int[]arrOne, int[]arrTwo){
        int arrMany[] = new int[arrOne.length + arrTwo.length];
        int firstInd = 0; int secondInd = 0; int i = 0;
        while (i < arrMany.length){
            arrMany[i] = arrOne[firstInd] < arrTwo[secondInd] ? arrOne[firstInd++] : arrTwo[secondInd++];
            if (firstInd == arrOne.length){
                System.arraycopy(arrTwo, secondInd, arrMany, ++i, arrTwo.length - secondInd);
                break;
            }
            if (secondInd == arrTwo.length){
                System.arraycopy(arrOne, firstInd, arrMany, ++i, arrOne.length - firstInd);
                break;
            }
            i++;
        }
        return arrMany;
    }
}
