package Grow.Algorithmization.Decomposition;

// Дано натуральное число N. Написать метод(методы) для
// формирования массива, элементами которого являются цифры числа N.

import java.util.Arrays;
import java.util.Scanner;

public class TaskDecomposition10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Input number");
        int n = sc.nextInt();
        sc.close();

        fillArray(n);
    }
    private static void fillArray(int n){
        int[] array;
        StringBuilder str = new StringBuilder();
        while (n > 0){
            str.insert(0, n % 10);
            n /= 10;
        }
        array = stringToIntArray(str.toString());
        System.out.println(Arrays.toString(array));
    }
    private static int[] stringToIntArray(String s){
        String[] strings = s.split(" ");
        int[] arr = new int[strings.length];
        int i = 0;
        for (String str : strings){
            arr[i] = Integer.parseInt(str.trim());
        }
        return arr;
    }
}
