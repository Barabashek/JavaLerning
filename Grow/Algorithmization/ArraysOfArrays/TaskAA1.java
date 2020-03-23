package Grow.Algorithmization.ArraysOfArrays;

//Дана матрица. Вывести на экран все нечетные столбцы, у которых первый элемент больше последнего.

public class TaskAA1 {
    public static void main(String[] args) {
        int[][]matrix = new int[4][5];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) Math.round(Math.random()*12);
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println("Требуемые по условию столбцы матрицы:");
        for (int i = 0; i < matrix.length; i ++) {
            for (int j = 0; j < matrix[i].length; j += 2) {
                if (matrix[0][j] > matrix[matrix.length - 1][j]) {
                    System.out.print(matrix[i][j] + "\t");
                }
            }
            System.out.println();
        }
    }
}

