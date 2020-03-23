package Lesson.Lesson2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Lesson2 {
    public static void main(String[] args) throws IOException {
        System.out.println("Выберите вариант конвертации: ");
        System.out.println("1 - Сажени в метры");
        System.out.println("2 - дюймы в сантиметры");
        System.out.println("3 - футы в метры");
        System.out.println("4 - драхмы в граммы");
        System.out.println("5 - унции в граммы");
        System.out.println("6 - фунты в килограммы");
        System.out.println("7 - аршины в метры");
        System.out.println("8 - золотники в граммы");
        System.out.println("9 - дюймы в миллиметры");
        System.out.println();
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line = reader.readLine();
        System.out.println();
        System.out.println("Введите значение");
        System.out.println();
        double value = Double.parseDouble(reader.readLine());;
        System.out.println();
        double result;
        switch (line){
            case "1":
                result = value * 2.13;
                System.out.println(value + " сажень(ей) - " + result + " м");
                break;
            case "2":
                result = value * 2.5;
                System.out.println(value + " дюйм(ов) - " + result + " см");
                break;
            case "3":
                result = value * 0.30;
                System.out.println(value + " фут(ов) - " + result + " м");
                break;
            case "4":
                result = value * 3.73;
                System.out.println(value + " драхм(а) - " + result + " г");
                break;
            case "5":
                result = value * 28.34;
                System.out.println(value + " унция(й) - " + result + " г");
                break;
            case"6":
                result = value * 0.35;
                System.out.println(value + " фунт(ов) - " + result + " кг");
                break;
            case "7":
                result = value * 0.71;
                System.out.println(value + " аршин(ов) - " + result + " м");
                break;
            case "8":
                result = value * 4.26;
                System.out.println(value + " золотник(ов) - " + result + " г");
                break;
            case "9":
                result = value * 25;
                System.out.println(value + " дюйм(ов) - " + result + " мм");
                break;
                default:
                    System.out.println("Вы ввели недействительное значение");
                    break;
        }
    }
}