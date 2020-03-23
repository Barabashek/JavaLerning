package Grow.Algorithmization.ArraysOfArrays;

//Найти положительные элементы главной диагонали квадратной матрицы.

public class TaskAA10 {
    public static void main(String[] args) {
        int[][]matrix = new int[5][5];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) Math.round((Math.random()*12)-3);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Вывод положительных элементов главной диагонали: ");
        for (int i = 0; i < matrix.length; i++){
            if (matrix[i][i] > 0)
                System.out.print(matrix[i][i] + " ");
        }
    }
}
