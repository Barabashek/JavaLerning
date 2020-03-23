package Grow.Algorithmization.ArraysOfArrays;

//Сформировать квадратную матрицу порядка N по правилу: A[I,J] = sin((I^2 - J^2) / N)
//и подсчитать количество положительных элементов в ней.

import java.util.Scanner;

public class TaskAA7 {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        int k = 0;
        double [][] matrix = new double[n][n];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                matrix[i][j] = Math.sin((Math.pow(i, 2) - Math.pow(j, 2))/ n);
                if (matrix[i][j] > 0)
                    k++;
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Количество положительных элементов:");
        System.out.println(k);
    }
}
