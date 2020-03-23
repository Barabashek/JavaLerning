package Grow.Algorithmization.Decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя и наименьшего общего кратного двух
//натуральных чисел: НОК(А,В) = А*В/НОД(А,В)

import java.util.Scanner;

public class TaskDecomposition01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите 1е натуральное число");
        int first = sc.nextInt();
        System.out.println("Введите 2е натуральное число");
        int second = sc.nextInt();
        sc.close();

        int result = findNOD(first, second);
        int result1 = findNOK(first, second);
        System.out.println();
        System.out.printf("NOD - %d, NOK - %d", result, result1);
    }
    public static int findNOD(int a, int b){
        int d = 0;
        while (b != 0 && a != 0){
            if (a > b){
                a %= b;
            } else
                b %= a;
            d = a + b;
        }
        return d;
    }
    public static int findNOK(int a, int b){
        return ((a*b)/findNOD(a, b));
    }
}
