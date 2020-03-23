package Lesson.Lesson3;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson3 {
    public static void main(String[] args) throws IOException {
        System.out.print("Введите сумму в рублях: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        double sum = Double.parseDouble(reader.readLine());
        System.out.println();
        System.out.print("Укажите количество лет: ");
        int year = Integer.parseInt(reader.readLine());
        System.out.println();
        double result;
        for (int i = 1; i <= year; i++){
            result = sum * 0.03 * i + sum;
            System.out.println("Через " + i + " лет сумма вклада станет равна " + result + " руб.");
        }
    }
}
