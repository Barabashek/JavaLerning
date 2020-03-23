package Grow.BasicsOfSoftwareCodeDevelopment.LinearProg;

public class Trigonometry {
    public static void main(String[] args) {
        int x = 5, y = 4;
        int z = (int) (((Math.sin(x) + Math.cos(y)) / (Math.cos(x) - Math.sin(y))) * Math.tan(x*y));
        System.out.println("Ответ: " + z);
    }
}
