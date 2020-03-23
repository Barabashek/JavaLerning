package Grow.Algorithmization.OneDimensionalArrays;

//Дан массив действительных чисел, размерность которого N. Подсчитать, сколько в нем отрицательных,
//положительных и нулевых элементов.

import java.util.Arrays;

public class Task3 {
    public static void main(String[] args) {
        double[] array = {-2.5, -10.0, 0.0, 4.3, 5.0, 10.9, -15.15, 0.0, 0.0, -20.4, -4.0, 1.0};
        int countNegative = 0;
        int countPositive = 0;
        int countNull = 0;
        Arrays.sort(array);
        for (double i : array){
            System.out.print(i + " ");
            if (i < 0)
                countNegative++;
            else if (i == 0 )
                countNull++;
            else
                countPositive++;
        }
        System.out.printf("\nОтрицательных чисел %d, нулей %d, положительных чисел %d", countNegative, countNull, countPositive);
    }
}
