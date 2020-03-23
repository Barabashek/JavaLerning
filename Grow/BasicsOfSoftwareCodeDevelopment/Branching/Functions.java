package Grow.BasicsOfSoftwareCodeDevelopment.Branching;

import java.util.Scanner;

public class Functions {
    public static void main(String[] args) {
        int x, y;
        System.out.println("Вычислить значение функции: F(x) = {x^2 - 3x + 9 если x<=3, 1/(x^2 + 6) если x > 3}");
        System.out.print("Введите значение x: ");
        Scanner scanner = new Scanner(System.in);
        x = Integer.parseInt(scanner.nextLine());
        if (x < 3 || x == 3){
            y = (int) Math.pow(x, 2) - 3 * x + 9;
        } else {
            y = (int) (1/(Math.pow(x, 3) + 6));
        }
        System.out.printf("\nF(x) = %d", y);
    }
}
