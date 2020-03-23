package Grow.Algorithmization.ArraysOfArrays;

//Найдите наибольший элемент матрицы и заменить все нечетные элементы на него.

import java.util.Scanner;

public class TaskAA15 {
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
                matrix[i][j] = (int) Math.round(Math.random() * 100);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        replaceOddElement(matrix);
    }
    public static void replaceOddElement(int [][]matrix){
        int moreElement = matrix[0][0];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                if (matrix[i][j] > moreElement)
                    moreElement = matrix[i][j];
                if (matrix[i][j] % 2 != 0)
                    matrix[i][j] = moreElement;
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        System.out.println(moreElement);
    }
}
