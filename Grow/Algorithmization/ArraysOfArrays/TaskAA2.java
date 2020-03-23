package Grow.Algorithmization.ArraysOfArrays;

//Дана квадратная матрица. Вывести на экран элементы, стоящие на диагонали.

public class TaskAA2 {
    public static void main(String[] args) {
        int[][]matrix = new int[4][4];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) Math.round(Math.random()*12);
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Вывод элементов главной диагонали: ");
        for (int i = 0; i < matrix.length; i++){
                System.out.print(matrix[i][i] + " ");
            }
        }
    }
