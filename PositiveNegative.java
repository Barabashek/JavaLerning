import java.util.Scanner;

public class PositiveNegative {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Random random = new Random();

        int lenghtArray = sc.nextInt();
        int[] a = new int[lenghtArray];

        for (int i = 0; i < lenghtArray; i++) {
            a[i] = sc.nextInt();
            //System.out.println(a[i]);
        }

        int countPos = 0;
        int countNeg = 0;
        int zero = 0;

        for (int i = 0; i < a.length; i++){
            if (a[i] > 0) countPos++;
            if (a[i] < 0) countNeg++;
            if (a[i] == 0) zero++;

        }
        System.out.println("Null: " + zero);
        System.out.println("Positive numbers: " + countPos);
        System.out.println("Negative numbers: " + countNeg);
    }
}