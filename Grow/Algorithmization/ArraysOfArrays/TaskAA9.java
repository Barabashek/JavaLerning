package Grow.Algorithmization.ArraysOfArrays;

//Задана матрица неотрицательных чисел. Посчитать сумму элементов в каждом столбце. Определить, какой
//столбец содержит максимальную сумму.

import java.util.Scanner;

public class TaskAA9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размерность матрицы: ");
        int n = sc.nextInt();
        int m = n;
        sc.close();

        manySummColumn(m,n);
    }
    public static void manySummColumn(int m, int n){
        int sum = 0; int s;
        int column = 0;
        int [][]matrix = new int[m][n];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) Math.round(Math.random()*12);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println();
        for (int j = 0; j < m; j++){
            s = 0;
            for (int i = 0; i < n; i++){
                s += matrix[i][j];
            }
            System.out.print(s + "\t ");
            if (s > sum){
                sum = s;
                column = j;
            }
        }
        System.out.println();
        System.out.println(column);
    }
}
