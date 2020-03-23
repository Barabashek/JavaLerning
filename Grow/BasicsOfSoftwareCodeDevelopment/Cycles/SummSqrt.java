package Grow.BasicsOfSoftwareCodeDevelopment.Cycles;

public class SummSqrt {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("Сумма квадратов всех чисел от 1 до 100 равна: ");
        for (int i = 1; i <= 100; i++){
           sum = (int) (sum + Math.pow(i, 2));
        }
        System.out.print(sum);
    }
}
