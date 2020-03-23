package Grow.Algorithmization.Decomposition;

//Написать метод(методы), определяющий, в каком из данных двух чисел больше цифр.

import java.util.Scanner;

public class TaskDecomposition11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("First");
        int one = sc.nextInt();
        System.out.println("Second");
        int two = sc.nextInt();
        sc.close();

        String[] first = numberToComponent(one);
        String[] second = numberToComponent(two);
        comparing(first, second);

    }
    public static void comparing(String[]s, String[]f){
        if (s.length > f.length){
            System.out.println("Количество цифр в первом числе больше");
            for (String str : s) System.out.print("певое число: " + str);
        }
        else{
            System.out.println("Количество цифр во втором числе больше");
            for (String str : f) System.out.print("Второе число: " + str);
        }
    }
    private static String[] numberToComponent(int n){
        StringBuilder str = new StringBuilder();
        while (n > 0){
            str.insert(0, n % 10);
            n /= 10;
        }
        String[] strings = str.toString().split(" ");
        return strings;
    }
}
