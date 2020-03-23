package Grow.Strings.StringAsObject;

//С помощью функции копирования и операции конкатенации составить из частей слова “информатика” слово “торт”.

public class TaskStringAsObject04 {
    public static void main(String[] args) {
        String string = "Информатика";
        StringBuilder builder = new StringBuilder();
        builder.append(string.substring(7,8)).append(string.substring(3,5)).append(string.substring(7,8));
        System.out.println(string);
        System.out.println(builder.toString());
    }
}
