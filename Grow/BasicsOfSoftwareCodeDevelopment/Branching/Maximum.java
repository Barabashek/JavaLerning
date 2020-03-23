package Grow.BasicsOfSoftwareCodeDevelopment.Branching;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Maximum {
    public static void main(String[] args) throws IOException {
        int a,b,c,d;
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Input values: ");
        a = Integer.parseInt(reader.readLine());
        b = Integer.parseInt(reader.readLine());
        c = Integer.parseInt(reader.readLine());
        d = Integer.parseInt(reader.readLine());

        System.out.printf("a = %d, b = %d, c = %d, d = %d", a,b,c,d);
        System.out.println();
        System.out.println("\nMax values is: " + max(a, b, c, d));
    }

    public static int max(int a, int b, int c, int d){
        int minFirst;
        int minSecond;
        int max;
        if (a < b){
            minFirst = a;
            System.out.printf("First min value is: %d", minFirst);
        } else {
            minFirst = b;
            System.out.printf("First min value is: %d", minFirst);
        }
        if (c < d){
            minSecond = c;
            System.out.printf("\nSecond min value is: %d", minSecond);
        } else {
            minSecond = d;
            System.out.printf("\nSecond min value is: %d", minSecond);
        }
        if (minFirst > minSecond){
            max = minFirst;
        } else
            max = minSecond;
        return max;
    }
}
