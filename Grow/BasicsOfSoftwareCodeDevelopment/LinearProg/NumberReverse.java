package Grow.BasicsOfSoftwareCodeDevelopment.LinearProg;

public class NumberReverse {
    public static void main(String[] args) {
        double R = 753.159;
        String str = Double.toString(R);
        String nullIndex = str.substring(0, 3);
        String firstIndex = ".";
        String secondIndex = str.substring(4);
        String newString = secondIndex + firstIndex + nullIndex;
        double newR = Double.parseDouble(newString);
        System.out.println(newR);
    }
}
