package Lesson.Lesson4;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson4 {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int inputNumber = Integer.parseInt(reader.readLine());
        int sum = 0;
        for (int i = 1; i <= inputNumber; i++) {
            sum = sum + (int)(Math.pow(i, 2));
            //System.out.println(sum);
            }
        System.out.println(sum);
        }
    }

