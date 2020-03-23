package Grow.BasicsOfSoftwareCodeDevelopment.Cycles;

import java.util.Scanner;

public class ValueFunctionOnSection {
    public static void main(String[] args) {
        int a,b,h,x, y = 0;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Укажите длину отрезка: ");
        a = Integer.parseInt(scanner.nextLine());
        b = Integer.parseInt(scanner.nextLine());
        System.out.printf("Длина отрезка: [%d, %d]", a, b);
        System.out.println("\nУкажите шаг: ");
        h = Integer.parseInt(scanner.nextLine());
        System.out.println("Шаг равен: " + h);
        for (x = a; x <= b - h; x += h){
            if (x > 2)
                y = x;
            else if (x <= 2)
                y = -x;
        }
        System.out.println("y = " + y);

    }

}
