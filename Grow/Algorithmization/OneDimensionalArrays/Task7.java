package Grow.Algorithmization.OneDimensionalArrays;

//Даны действительные числа a1, a2 ... an. Найти max(a1 + a2n, a2 + a2n-1, ..., an + an+1)


public class Task7 {
    public static void main(String[] args) {
        int[] arr = new int[10];
        for (int i = 0; i < arr.length; i++){
            arr[i] = i;
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.print(getMaxSum(arr));
    }
    public static int getMaxSum(int[]arr){
        int maxSum = Integer.MIN_VALUE;
        for (int i = 0, j = arr.length - 1; i < j; i++, j --){
            maxSum = Integer.max(maxSum, arr[i] + arr[j]);
        }
        return maxSum;
    }
}
