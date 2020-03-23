package Grow.BasicsOfSoftwareCodeDevelopment.LinearProg;

public class ValueOfFunction2 {
    public static void main(String[] args){
        int a = 5, b = 4, c = 9;
        int d = (int) ((b + Math.sqrt((Math.pow(b, 2)) + 4 * a * c) / 2 * a) - Math.pow(a, 3) * c + Math.pow(b, -2));
        System.out.println("Ответ: " + d);
    }
}