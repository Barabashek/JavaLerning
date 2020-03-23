package Grow.Algorithmization.OneDimensionalArrays;

//Дана последовательность целых чисел a1, a2,..., an . Образовать новую последовательность, выбросив из
//исходной те члены, которые равны min(a1, a2, ..., an).

import java.util.Arrays;

public class Task8 {
    public static void main(String[] args) {
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) Math.round((Math.random() * 30));
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        System.out.println(Arrays.toString(removeMinimums(arr)));
    }
    public static int[] removeMinimums(int[] arr) {
        int count = 0;
        int min = Integer.MAX_VALUE;

        for (int d : arr) {
            if (d < min) {
                count = 1;
                min = d;
            }
            else if (d == min) {
                count++;
            }
        }

        int i = 0;
        int[] res = new int[arr.length - count];
        for (int d : arr) {
            if (d > min) {
                res[i++] = d;
            }
        }
        return res;
        }
    }
