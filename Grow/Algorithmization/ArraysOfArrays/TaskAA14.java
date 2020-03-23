package Grow.Algorithmization.ArraysOfArrays;

//Сформировать случайную матрицу m x n, состоящую из нулей и единиц, причем в каждом столбце число
//единиц равно номеру столбца.

import java.util.Scanner;

public class TaskAA14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int[][] matrix = new int[m][n];
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = 0;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        for (int j = 0; j < n; j++){
            for (int k = 0; k < m; k++){
                for (int i = 0; i < m; i++){
                    if (j < m && j < i){
                        matrix[j][i] = 1;
                    }
                }
            }
        }
        System.out.println();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
