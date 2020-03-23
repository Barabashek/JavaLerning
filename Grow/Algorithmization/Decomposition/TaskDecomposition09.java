package Grow.Algorithmization.Decomposition;

// Даны числа X, Y, Z, Т — длины сторон четырехугольника.
// Написать метод(методы) вычисления его площади, если угол между сторонами длиной X и Y— прямой.

import java.util.Scanner;

public class TaskDecomposition09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter quadrangle sides");
        int X = sc.nextInt();
        int Y = sc.nextInt();
        int Z = sc.nextInt();
        int T = sc.nextInt();
        sc.close();

        int result = squareArea(X,Y,Z,T);
        System.out.println(result);
    }
    private static int squareArea(int a, int b, int c, int d){
        int area = 0;
        int ab = (int) Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
        double areaOne = a*b*0.5;
        double areaTwo = 0.25 * Math.sqrt((ab + c + d)*(ab + c - d)*(ab + d - c)*(c + d - ab));
        area = (int) (areaOne + areaTwo);
        return area;
    }
}
