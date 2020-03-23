package Grow.Algorithmization.ArraysOfArrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 1    2   3 ... n
// n  n-1 n-2 ... 1
// 1    2   3 ... n
// n  n-1 n-2 ... 1
// 1    2   3 ... n
// n  n-1 n-2 ... 1

import java.util.Scanner;

public class TaskAA4 {
    static int n,k,num;


    public static void main(String[] argv) {

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); k = 1; num = n;
        sc.close();

        int[][] arr = new int[n][n];

        for(int i = 0; i < arr.length; i++) {
            if(i % 2 == 0) {
                for(int j = 0; j < arr.length; j++) {
                    arr[i][j] = k;
                    k++;
                }k = 1;
            }
            else{
                for(int j = 0; j < arr.length; j++) {
                    arr[i][j] = num;
                    num--;
                } num = n;
            }
        }

        for(int i = 0; i < arr.length; i++) {
            for(int  j = 0; j < arr.length; j++) {
                System.out.print(arr[i][j] + " ");
            }System.out.println();
        }
    }
}