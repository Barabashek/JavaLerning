// Заполнить массив заданной длины различными простыми числами
// Натуральное число, большее единицы, называется простым, если оно делится только на себя и на единицу.

import java.util.Arrays;

public class Lesson {
    public static void main(String[] args) {
        int [] easyNum = new int[10];
        int x = 2;
        int count = 0;
        boolean isSimple;
        while (count < easyNum.length){
            int i = 0;
            isSimple = true;
            while (isSimple && i < count){
                if (x % easyNum[i] == 0) {
                    isSimple = false;
                }
                i++;
            }
            if (isSimple){
                easyNum[count] = x;
                count++;
                x++;
            } else {
                x++;
            }
        }
        System.out.println(Arrays.toString(easyNum));
    }
}