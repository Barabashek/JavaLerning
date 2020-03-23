package Grow.Algorithmization.Decomposition;

//Написать метод(методы), проверяющий, являются ли данные три числа взаимно простыми.

import java.util.Scanner;

public class TaskDecomposition06 {
    public static void main(String[] args) {
        int a,b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input three natural numbers");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();

        System.out.println();
        System.out.println(isPrime(a,b,c));
    }
    public static int nod(int a, int b){
        if (b > a) return nod(b, a);
            if (b == 0) return a;
            return nod(b, a % b);
    }
    public static boolean isPrime(int a, int b, int c){
        return (nod((nod(a, b)), c) == 1);
    }
}
