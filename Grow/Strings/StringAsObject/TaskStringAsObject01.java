package Grow.Strings.StringAsObject;

//Дан текст (строка). Найдите наибольшее количество подряд идущих пробелов в нем.

public class TaskStringAsObject01 {
    public static void main(String[] args) {
        String string = "Удалить   лишние       пробелы  между словами";
        int findSpaces = contSpaces(string);
        System.out.println(findSpaces);
    }
    public static int contSpaces(String string){
        int count = 0;
        int moreCount = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == ' '){
                count++;}
            else {
                if (moreCount < count){
                    moreCount = count;
                }
                count = 0;
            }
        }
        return moreCount;
    }
}
