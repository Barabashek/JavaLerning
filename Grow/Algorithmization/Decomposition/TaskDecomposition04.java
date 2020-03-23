package Grow.Algorithmization.Decomposition;

// На плоскости заданы своими координатами n точек. Написать метод(методы),
// определяющие, между какими из пар точек самое большое расстояние.
// Указание. Координаты точек занести в массив.

import java.util.Arrays;
import java.util.Scanner;

public class TaskDecomposition04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] x = new double[n];
        double[] y = new double[n];
        double length;
        sc.close();

        for (int i = 0; i < x.length; i++) x[i] = Math.random()*10;
        for (int i = 0; i < y.length; i++) y[i] = Math.random()*10;
        System.out.println(Arrays.toString(x));
        System.out.println(Arrays.toString(y));
        length = findLength(x,y);
        System.out.println(length);
    }
    public static double findLength(double[]x, double[]y){
        double length;
        double maxLength = 0;
        for (int i = 0; i < x.length; i++){
            for (int j = 0; j < y.length; j++){
                length = findLengthToPoint(x[j] - x[i], y[j] - y[i]);
                if (maxLength < length)
                    maxLength = length;
            }
        }
        return maxLength;
    }
    private static double findLengthToPoint(double x, double y){
        double lengthPointToPoint = Math.round(Math.sqrt((Math.pow(x,2))+ (Math.pow(y,2))));
        return lengthPointToPoint;
    }
}
