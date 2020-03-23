package Grow.Algorithmization.ArraysOfArrays;

//Сформировать квадратную матрицу порядка n по заданному образцу(n - четное):
// 1 1 1 ... 1 1 1
// 0 1 1 ... 1 1 0
// 0 0 1 ... 1 0 0
// | | |  \  | | |
// 0 1 1 ... 1 1 0
// 1 1 1 ... 1 1 1

import java.util.Scanner;

public class TaskAA6 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();

        int[][] matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
            if ((j >= i && j <= n - i - 1)||(j <= i && j >= n - i - 1)){
                matrix[i][j] = 1;
                }else
                    matrix[i][j] = 0;
            }
        }
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0;j < matrix.length; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
