package Lesson.Lesson5;

public class Lesson5 {
    public static void main(String[] args) {
        for (int i = 10000; i <= 99999; i++){
            int n = i;
            if (n % 2 != 0) continue;
            int mid = (n%1000)/100;
            if (mid % 2 == 0) continue;
            int sum = 0;
            while (n > 0){
                sum += n%10;
                n /= 10;
            }
            if (sum % 4 == 0) System.out.println(i + " ");
        }
    }
}
