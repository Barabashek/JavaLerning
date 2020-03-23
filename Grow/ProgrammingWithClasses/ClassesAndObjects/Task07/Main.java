package Grow.ProgrammingWithClasses.ClassesAndObjects.Task07;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        TriangleMethods tmethods = new TriangleMethods();

        int[] pointA = new int[]{0,0};
        int[] pointB = new int[]{0,10};
        int[] pointC = new int[]{8, 0};

        Triangle tr = new Triangle(pointA, pointB, pointC);

        System.out.println("Triangle area: ");
        System.out.println(tmethods.TriangleArea(tr));
        System.out.println("Triangle area by Geron");
        System.out.println(tmethods.TriangleAreaByGeron(tr));
        System.out.println("Triangle perimetr");
        System.out.println(tmethods.TrianglePerimetr(tr));
        System.out.println("Point of Median Cross");
        System.out.println(Arrays.toString(tmethods.MedianCrossPoints(tr)));
    }
}
