package Lesson.Lesson6;

public class Lesson6 {
    public static boolean isTree(int n){
        while (n > 0){
            if (n % 10 == 3) return true;
            n /= 10;
        }
        return false;
    }
    public static void main(String[] args) {
        for (int i = 1000; i <= 9999; i++){
            if (isTree(i)){
                System.out.println(i);
            }
        }
    }

}
