package Grow.Algorithmization.ArraysOfArrays;

//Отсотрировать стобцы матрицы по возрастанию и убыванию значений эементов.

import java.util.Scanner;

public class TaskAA13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        int[][] matrix = new int[m][n];
        System.out.println("Матрица matrix построена.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 20);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        bubbleSortUP(matrix, m,n);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        bubbleSortLow(matrix, m,n);
        System.out.println();
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
    public static void bubbleSortUP(int[][]matrix, int m, int n){
        int buff;
        for (int j = 0; j < n; j++){
            for (int k = 0; k < m; k++){
                for (int i = 0; i < m - 1; i++){
                    if (matrix[i][j] > matrix[i + 1][j]){
                        buff = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = buff;
                    }
                }
            }
        }
    }
    public static void bubbleSortLow(int[][]matrix, int m, int n){
        int buff;
        for (int j = 0; j < n; j++){
            for (int k = 0; k < m; k++){
                for (int i = 0; i < m - 1; i++){
                    if (matrix[i][j] < matrix[i + 1][j]){
                        buff = matrix[i][j];
                        matrix[i][j] = matrix[i + 1][j];
                        matrix[i + 1][j] = buff;
                    }
                }
            }
        }
    }
    /*
    public static void sortMatrixToUp(int[][] matrix) {
        int column = 0;
        Arrays.sort(matrix, (o1, o2) -> {
            if (o1[column]>o2[column])
                return 1;
            else
                return -1;
        });
    }
    public static void sortMatrixToLow(int[][] matrix){
        int column = 0;
            Arrays.sort(matrix, (o1, o2) -> {
                if (o1[column]<o2[column])
                    return 1;
                else
                    return -1;
                });
            }
        }
     */

}
