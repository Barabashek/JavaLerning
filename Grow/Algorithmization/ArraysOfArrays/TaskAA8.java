package Grow.Algorithmization.ArraysOfArrays;

//В числовой матрице поменять местами два любых столбца, т. е. все элементы одного столбца поставить
//на соответствующие им позиции другого, а его элементы переместить в первый. Номера столбцов вводит
//пользователь с клавиатуры.

import java.util.Scanner;

public class TaskAA8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Размерность матрицы: ");
        int n = sc.nextInt();

        int[][]matrix = new int[n][n];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) Math.round(Math.random()*12);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Введите номера столбцов которые следует поменять местами: ");
        int firstColumn = sc.nextInt();
        int secondColumn = sc.nextInt();
        sc.close();
        int buff;
        for (int i = 0; i < n; i++){
            buff = matrix[i][firstColumn];
            matrix[i][firstColumn] = matrix[i][secondColumn];
            matrix[i][secondColumn] = buff;
        }
        System.out.println("Матрица после замены столбцов: ");
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix.length; j++){
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
    }
}
