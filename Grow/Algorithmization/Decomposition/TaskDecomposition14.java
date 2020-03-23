package Grow.Algorithmization.Decomposition;

// Натуральное число, в записи которого n цифр, называется числом Армстронга,
// если сумма его цифр, возведенная в степень n, равна самому числу.
// Найти все числа Армстронга от 1 до k. Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class TaskDecomposition14{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        sc.close();

        findArmstrongNumber(number);

    }
    public  static void  findArmstrongNumber(int num){
        for (int i = 1; i < num; i++){
            int summ = 0, buf = 0;
            for (int j = i; j > 1; j /= 10)
                buf++;
            int a = i;
            while (a > 1){
                int b = (int) Math.pow(a % 10, buf);
                summ += b;
                a /= 10;
            }
            if (summ == i){
                System.out.print(i + " ");
            }
        }
    }
}