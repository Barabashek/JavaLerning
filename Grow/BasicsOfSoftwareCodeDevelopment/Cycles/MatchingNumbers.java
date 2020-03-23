package Grow.BasicsOfSoftwareCodeDevelopment.Cycles;

// Даны два числа. Определить цифры, входящие в запись как первого так и второго числа.

import java.util.Scanner;

public class MatchingNumbers {
    public static void main(String[] args) {
        System.out.println("Введите два числа:");
        Scanner sc = new Scanner(System.in);
        int first = Integer.parseInt(sc.nextLine());
        int second = Integer.parseInt(sc.nextLine());
        String firstNum = Integer.toString(first);
        String secondNum = Integer.toString(second);
        sc.close();
        String result = "";
        System.out.print("Общие цифры в веденных числах: ");
        for (int i = 0; i < firstNum.length(); i++){
            for (int j = 0; j < secondNum.length(); j++){
                if (firstNum.charAt(i) == secondNum.charAt(j)){
                    result = String.valueOf(secondNum.charAt(j));}
            }
            result = result.replaceAll("([\\s\\S])\\1+", "$1");
            System.out.print(result + " ");
        }
    }
}
