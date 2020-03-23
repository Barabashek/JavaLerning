package Grow.Algorithmization.Sorting;

//Даны дроби p1/q1, p2/q2, ..., pn/qn (pi, qi - натуральные).
//Составить программу, которая приводит эти дроби к общему знаменателю и упорядочивает их в порядке возрастания.

public class TaskSort8 {
    public static void main(String[] args) {
        int[] p = {4, 7, 2, 3};
        int[] q = {12, 8, 5, 6};
        int n = msd(q[0], q[1]);

        for (int i = 2; i < q.length; i++){
            n = msd(n, q[i]);
        }
        for (int i = 0; i < p.length; i++){
            p[i] = n / q[i] * p[i];
        }
        for (int i = 0; i < p.length; i++){
            int minElemInd = i;
            for (int j = i; j < p.length; j++){
                if (p[minElemInd] > p[j]) {
                    minElemInd = j;
                }
                if (minElemInd != i){
                    int buff = p[i];
                    p[i] = p[minElemInd];
                    p[minElemInd] = buff;
                }
            }
        }
        for (int i = 0; i < p.length; i++){
            System.out.print(p[i] + "/" + n + "\t");
        }
    }
    private static int lsd(int a, int b){
        while (a % b != 0){
            int buff = b;
            b = a % b;
            a = buff;
        }
        return b;
    }

    private static int msd (int a, int b){
        return (a*b/lsd(a,b));
    }
}
