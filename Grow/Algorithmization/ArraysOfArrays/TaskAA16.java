package Grow.Algorithmization.ArraysOfArrays;

//Магическим квадратом порядка n называется квадратная матрица размера nxn, составленная из чисел 1, 2, 3,
//..., 2 n так, что суммы по каждому столбцу, каждой строке и каждой из двух больших диагоналей равны между
//собой. Построить такой квадрат. Пример магического квадрата порядка 3:
//   6  1  8
//   7  5  3
//   2  9  4


import java.util.Scanner;

public class TaskAA16 {
    public static void main(String args[])
    {
        Scanner in = new Scanner (System.in);
        System.out.print("Vvedite: N = ");
        int n = in.nextInt();
        int[][] a = new int[n][n];
        if (n % 4 > 0)
        {
            System.out.print("Error: N ne kratno 4 - em. Vvedite drugoe chislo.");
        }
        else
        {
            System.out.println("Ishodniy massiv: ");
            TaskAA16.GenerateArray(a);
            TaskAA16.PrintArray(a);
            System.out.println("Magicheskiy kvadrat: ");
            TaskAA16.ReverseArray1(a);
            TaskAA16.ReverseArray2(a);
            TaskAA16.PrintArray(a);
        }
    }

    public static void PrintArray(int a[][])
    {
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                System.out.print(a[i][j] + "\t");
            }
            System.out.println();
        }
    }

    public static void GenerateArray(int a[][])
    {
        int k = 1;
        for (int i = 0; i < a.length; i++)
        {
            for (int j = 0; j < a.length; j++)
            {
                a[i][j] = k;
                k++;
            }
        }
    }

    public static void ReverseArray1(int a[][])
    {
        int t;
        for (int i = 0; i < a.length / 2; i++)
        {
            for (int j = 0; j < a.length / 2; j++)
            {
                if (i == j)
                {
                    t = a[i][j];
                    a[i][j] = a[a.length - 1 - i][a.length - 1 - j];
                    a[a.length - 1 - i][a.length - 1 - j] = t;
                }
            }
        }
    }

    public static void ReverseArray2(int a[][])
    {
        int t;
        for (int i = 0, j = a.length - 1 - i; i <= (a.length / 2) - 1; ++i, --j)
        {
            t = a[i][j];
            a[i][j] = a[j][i];
            a[j][i] = t;
        }
    }
}
