package Grow.Algorithmization.Decomposition;

//  Два простых числа называются «близнецами», если они отличаются друг от друга на 2
// (например, 41 и 43). Найти и напечатать все пары «близнецов» из отрезка [n,2n],
//  где n - заданное натуральное число больше 2. Для решения задачи использовать декомпозицию.

import java.util.Scanner;

public class TaskDecomposition13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int n2 = sc.nextInt();
        sc.close();

        findPrimeNum(n, n2);
    }
    public static boolean isPrime(int n){
        int count = 0;
        for (int i = 1; i <= (int) Math.sqrt(n); i++){
            if (n % i == 0){
                if (i == Math.sqrt(n))
                    count++;
                else count += 2;
            }
        }
        if (count == 2) return true;
        else return false;
    }
    public static void findPrimeNum(int a, int b){
        int doubleA = a;
        int quantity = 0;
        while (doubleA % 2 != 0) doubleA++;
        for (int i = doubleA; i <= b; i ++) {
            if (isPrime(i - 1) && isPrime(i + 1)){
                if (!((i - 1)< doubleA || (i + 1) > b)){
                    quantity++;
                    System.out.println((i - 1)+ " " +(i + 1));
                }
            }
        }
        System.out.println("Quantity couples numbers are twins on the segment [" + a + "; " + b +"] " + quantity);
    }
}
