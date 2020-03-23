package Grow.Algorithmization.Decomposition;

//Написать метод(методы) для нахождения наибольшего общего делителя четырех натуральных чисел.

public class TaskDecomposition02 {
    public static void main(String[] args) {
        int first = 5;
        int second = 23;
        int third = 11;
        int forth = 6;
        int nod = 0;

        int[] array = new int[4];
        array[0] = first;
        array[1] = second;
        array[2] = third;
        array[3] = forth;

        for (int i = 0; i < array.length; i++){
            if (i + 1 < array.length){
                for (int j = i + 1; j <= i + 1; j++){
                    nod = findNOD(array[i], array[j]);
                }
                array[i + 1] = nod;
            }
        }
        System.out.println(nod);
    }
    public static int findNOD(int a, int b){
        if (b == 0) return a;
        else return findNOD(b, a % b);
    }
}
