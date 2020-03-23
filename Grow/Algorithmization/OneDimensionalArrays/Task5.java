package Grow.Algorithmization.OneDimensionalArrays;

//Даны целые числа а1 ,а2 ,..., аn . Вывести на печать только те числа, для которых аi > i.

public class Task5 {
    public static void main(String[] args) {
        int[] numb = {-10, 2, 30, -12, 3, -175, 6, 132, 0, 0, 13, 246, 57};
        //Arrays.sort(numb);
        for (int i = 0; i < numb.length; i++){
            if (numb[i] >= i){
                System.out.print(numb[i] + " ");
            }
        }
    }
}
