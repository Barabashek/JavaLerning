package Grow.BasicsOfSoftwareCodeDevelopment.Cycles;

//Для каждого натурального числа в промежутке от m до n вывести все делители, кроме единицы и самого числа.
//m и n вводятся с клавиатуры.

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class OutputDivider {
    public static void main(String[] args)throws IOException {
        int m, n;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите натуральные числа m и n: ");
        m = Integer.parseInt(reader.readLine());
        n = Integer.parseInt(reader.readLine());
        reader.close();
        System.out.printf("Указан ряд натуральных чисел в промежутке от m = %d до n = %d", m, n);
        System.out.println();
        divider(m, n);
    }
    public static void divider(int m, int n){

        System.out.println("Вывод делителей для каждого натурального числа:");
        for (int i = m; i <= n; i++){
            System.out.printf("Делитель числа %d: ", i);
            for (int j = 2; j < i; j++){
                if (i % j == 0){
                    System.out.print(j + "  ");
                }
            }
            System.out.println();
        }
    }
}
