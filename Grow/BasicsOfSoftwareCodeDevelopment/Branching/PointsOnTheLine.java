package Grow.BasicsOfSoftwareCodeDevelopment.Branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PointsOnTheLine {
    public static void main(String[] args)throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите координаты x, y для точки А: ");
        int x1 = Integer.parseInt(reader.readLine());
        int y1 = Integer.parseInt(reader.readLine());
        System.out.printf("\nКоординаты точки А: (%d, %d).", x1, y1);
        System.out.println("Введите координаты x, y для точки B: ");
        int x2 = Integer.parseInt(reader.readLine());
        int y2 = Integer.parseInt(reader.readLine());
        System.out.printf("\nКоординаты точки B: (%d, %d).", x2, y2);
        System.out.println("Введите координаты x, y для точки C: ");
        int x3 = Integer.parseInt(reader.readLine());
        int y3 = Integer.parseInt(reader.readLine());
        System.out.printf("\nКоординаты точки C: (%d, %d).", x3, y3);
        System.out.println();
        if (isPointOnLine(x1, x2, x3, y1, y2, y3)){
            System.out.println("Точки расположены на одной прямой");
        } else
            System.out.println("Точки не расположены на одной прямой");
    }

    public static boolean isPointOnLine(int x1, int x2, int x3, int y1, int y2, int y3){
        return ((x3 - x1) / (x2 - x1) == (y3 - y1) / (y2 - y1));
    }
}
