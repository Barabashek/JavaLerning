package Grow.Strings.StringAsArray;

// Удалить в строке все лишние пробелы, то есть серии подряд
// идущих пробелов заменить на одиночные пробелы. Крайние пробелы в строке удалить.

public class TaskStringAsArray05 {
    public static void main(String[] args) {
        String string = "Удалить   лишние       пробелы  между словами";
        System.out.println(removeSpace(string));
    }
    public static String removeSpace(String string){
        String replace = " ";
        while (string.contains("  ")){
            replace = string.replace("  ", " ");
            string = replace;
            }
        return string;
    }
}
