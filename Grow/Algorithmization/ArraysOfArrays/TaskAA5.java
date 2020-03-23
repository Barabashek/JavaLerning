package Grow.Algorithmization.ArraysOfArrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 1    1  1 ... 1 1 1
// 2    2  2 ... 2 2 0
// 3    3  3 ... 3 0 0
// |    |  |  \  0 0 0
// n-1 n-1 0 ... 0 0 0
// n    0  0 ... 0 0 0

import java.util.Scanner;

public class TaskAA5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.close();

        System.out.println();
        int[][] arr = new int[n][n];
        for (int i = 0; i < arr.length; i++){
            for (int j = 0; j < arr.length; j++ ){
                if (j >= n - i)
                    arr[i][j] = 0;
                else
                    arr[i][j] = i + 1;
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
