package Grow.Algorithmization.ArraysOfArrays;

//Матрицу 10x20 заполнить случайными числами от 0 до 15. Вывести на экран саму матрицу и номера строк, в
//которых число 5 встречается три и более раз.

public class TaskAA11 {
    public static void main(String[] args) {
        int[][]matrix = new int[10][20];
        for (int i = 0; i < matrix.length; i++){
            for (int j = 0; j < matrix[i].length; j++){
                matrix[i][j] = (int) Math.round((Math.random()*15));
                System.out.print(matrix[i][j] + "\t");
            }
            System.out.println();
        }
        int count;
        int[] string = new int[10];
        int stp = 0;
        for (int i = 0; i < 10; i++){
            count = 0;
            for (int j = 0; j < 20; j++){
                if (matrix[i][j] == 5)
                    count++;
            }
            if (count >= 3) {
                string[stp] = i;
                stp++;
            }
        }
        System.out.println();
        for (int i = 0; i < stp; i++){
            System.out.print(string[i] + "\t");
        }
    }
}
