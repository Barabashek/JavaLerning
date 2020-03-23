package Grow.BasicsOfSoftwareCodeDevelopment.Cycles;

public class CompositionSqrt {
    public static void main(String[] args) {
        long composition = 1;
        System.out.println("Произведение квадратов всех чисел от 1 до 200 равна: ");
        for (int i = 1; i <= 200; i++){
            composition = (long) (composition * Math.pow(i, 2));
        }
        System.out.print(composition);
    }
}
