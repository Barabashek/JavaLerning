package Grow.Algorithmization.ArraysOfArrays;

//Отсортировать строки матрицы по возрастанию и убыванию значений элементов.

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class TaskAA12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите размерность матрицы: ");
        int m = sc.nextInt();
        int n = sc.nextInt();
        sc.close();

        Integer[][] matrix = new Integer[m][n];
        System.out.println("Матрица matrix построена.");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) Math.round(Math.random() * 20);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Матрица отсортированная по возрастанию элементов: ");
        for (Integer[] i : matrix) Arrays.sort(i);
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]) + "\t");

        System.out.println("Матрица отсортированная по убыванию элементов: ");
        for (Integer[] i : matrix){
            Arrays.sort(i, (Comparator<Integer>) (o1, o2) -> {
                if (o1<o2) return 1;
                if (o1>o2) return -1;
                return 0;
            });
        }
        for (int i = 0; i < matrix.length; i++)
            System.out.println(Arrays.toString(matrix[i]) + "\t");
    }
}
