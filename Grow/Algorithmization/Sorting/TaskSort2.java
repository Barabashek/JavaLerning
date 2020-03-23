package Grow.Algorithmization.Sorting;

//Даны две последовательности a1 <= a2 <= ... <= an, b1 <= b2 <= ... <= bm . Образовать из них новую последовательность
//чисел так, чтобы она тоже была неубывающей. Примечание. Дополнительный массив не использовать.

import java.util.Arrays;
import java.util.Scanner;

public class TaskSort2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input First array length");
        int n = sc.nextInt();
        System.out.println("Input Second array length");
        int m = sc.nextInt();

        int [] arrayOne = new int[n];
        int [] arrayTwo = new int[m];

        for (int i = 0; i < n; i ++) arrayOne[i] = i * n;
        for (int i = 0; i < m; i ++) arrayTwo[i] = i * m;

        System.out.println(Arrays.toString(arrayOne));
        System.out.println(Arrays.toString(arrayTwo));

        int tmp = n;
        int[] buff = arrayOne;

        if(m > n){
            arrayOne = arrayTwo;
            n = m;
            arrayTwo = buff;
            m = tmp;
        }
        for (int i = 0; i < m; i++){
            for(int j = 0; j < m; j++ ){
                if(arrayTwo[i] < arrayOne[i]){
                    arrayOne[i] = arrayTwo[i];
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arrayOne));
    }
}
