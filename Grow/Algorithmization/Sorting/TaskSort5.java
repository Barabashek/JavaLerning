package Grow.Algorithmization.Sorting;

//Сортировка вставками. Дана последовательность чисел a1, a2, ..., an. Требуется переставить числа в порядке
//возрастания. Делается это следующим образом. Пусть a1, a2, ..., ai - упорядоченная последовательность, т. е.
//a1 <= a2 <= ... <= an. Берется следующее число ai+1 и вставляется в последовательность так, чтобы новая
//последовательность была тоже возрастающей. Процесс производится до тех пор, пока все элементы от i +1 до n
//не будут перебраны. Примечание. Место помещения очередного элемента в отсортированную часть производить
//с помощью двоичного поиска. Двоичный поиск оформить в виде отдельной функции.

import java.util.Arrays;
import java.util.Random;

public class TaskSort5 {
    public static void main(String[] args) {
        int[] array = new int[20];
        arrayCreate(array);
        System.out.println(Arrays.toString(array));
        System.out.println();
        insertSort(array);
        System.out.println(Arrays.toString(array));
    }
    public static void insertSort(int[]array){
        int buff, index;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] > array[i + 1]){
                buff = array[i + 1];
                array[i + 1] = array[i];
                index = i;
                while (index > 0 && buff < array[index - 1]){
                    array[index] = array[index - 1];
                    index--;
                }
                array[index] = buff;
            }
        }
    }
    public static int arrayRandomFill(){
        Random random = new Random();
        int randomNum = random.nextInt(47);
        return randomNum;
    }
    public static void arrayCreate(int[] array){
        for (int i = 0; i < array.length; i++){
            array[i] = arrayRandomFill();
        }
    }
}
