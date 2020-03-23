package Grow.Algorithmization.OneDimensionalArrays;

//Задана последовательность N вещественных чисел. Вычислить сумму чисел, порядковые номера которых
//являются простыми числами.

public class Task6 {
    public static void main(String[] args) {
        double[] num = {-10.2, 30.15, -12.0, 3.125, -175.98, 6.55, 132.132, 0.0, 0.0, 13.13, 246.845, 5.7};
        double sum = 0;
        int tmp;
        for (int i = 0; i < num.length; i++){
            if (isPrime(i)){
                sum += num[i];
            }
        }
        System.out.println(sum);
    }
    public static boolean isPrime(int num){
        for (int i = 2; i < num; i++){
            if (num % i == 0){
                return false;
            }
        }
        return true;
    }
}
