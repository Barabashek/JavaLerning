package Lesson.Lesson26;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Введите числа: ");
        System.out.println();
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        int z = ((a - 3) * b / 2) + c;
        System.out.println("Ответом выражения - ((a - 3) * b / 2) + c является число: " + z);
    }
}