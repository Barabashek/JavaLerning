package Grow.BasicsOfSoftwareCodeDevelopment.Cycles;

/*
Даны числовой ряд и некоторое число е. Найти сумму тех членов ряда, модуль которых больше или равен
заданному е. Общий член ряда имеет вид: an = 1/2^n + 1/3^n
*/
public class NumberSeries {
    public static void main(String[] args) {
        double sum = 0;
        double e = 0.001;
        for (int n = 1;;n++){
            double an = (1/Math.pow(2, n)) + (1/Math.pow(3, n));
            if (Math.abs(an) < e)
                break;
            sum += an;
        }
        System.out.println("sum = " + sum);
    }
}
