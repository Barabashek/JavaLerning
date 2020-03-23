package Grow.BasicsOfSoftwareCodeDevelopment.LinearProg;

import java.util.Scanner;

public class CoordinatGrid {
    public static void main(String[] args) {
        System.out.println("Укажите координаты точки: ");
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        scanner.close();

        System.out.println("x = " + x);
        System.out.println("y = " + y);
        scanner.close();

        System.out.println(insideSector(x,y));
    }
    public static boolean insideSector(int x, int y){
        if ((x > -5 && x < 5 && y > -4 && y <= 0)&&
                (x > -3 && x < 3 && y >= 0 && y < 5))
            return true;
        return false;
    }
}
