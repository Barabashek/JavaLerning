package Grow.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;

public class NumbersSumm {
    public static void main(String[] args) {
        int num;
        int sum = 0;
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        num = Integer.parseInt(scanner.nextLine());
        System.out.printf("\nСумма всех чисел от 1 до %d равна: ", num);
        if (num > 0){
            for (int i = 1; i <= num; i++){
                sum = sum + i;
            }
        } else {
            System.out.println("Веденное число меньше 0");
        }
        System.out.print(sum);
    }
}
