package Grow.BasicsOfSoftwareCodeDevelopment.Cycles;

//Вывести на экран соответствий между символами и их численными обозначениями в памяти компьютера

public class OutputComplianceNumber {
    public static void main(String[] args) {
        for (int i = 33; i <= 122; i++){
            char ch = (char) i;
            System.out.println(ch + " = " + i);
        }
    }
}
