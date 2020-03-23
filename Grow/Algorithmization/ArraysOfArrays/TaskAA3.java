package Grow.Algorithmization.ArraysOfArrays;

//Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

import java.util.Arrays;
import java.util.Scanner;

public class TaskAA3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int m = sc.nextInt();
        int n = sc.nextInt();

        int[][] matrix = new int[m][n];
        System.out.println("Матрица matrix построена.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 12);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Введите номер строки: ");
        int string = sc.nextInt();
        System.out.println("Введите номер столбца: ");
        int column = sc.nextInt();
        sc.close();

        System.out.println("");
        System.out.println("Вывод указанной строки массива: ");

        for (int i = 0; i < 1; i++) {
            System.out.print(Arrays.toString(matrix[string]) + " ");
        }

        System.out.println("");
        System.out.println("Вывод указанного столбца массива: ");
        for (int i = 0; i < m; i++){
            for (int j = 0; j < 1; j++) {
        System.out.print(matrix[i][column] + " ");
            }
            System.out.println();
        }
    }
}