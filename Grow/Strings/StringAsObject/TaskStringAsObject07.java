package Grow.Strings.StringAsObject;

//Вводится строка. Требуется удалить из нее повторяющиеся символы и все пробелы. Например, если было введено "abc cde def", то должно быть выведено "abcdef".

public class TaskStringAsObject07 {
    public static void main(String[] args) {
        String string = "abc cde def";
        String outPut = string.replaceAll(" ", "").chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString();
        System.out.println(outPut);
        System.out.println(deleteDuplicate(string));
    }
    private static String deleteDuplicate(String string){
        StringBuilder builder = new StringBuilder(string.replaceAll(" ", ""));
        for (int i = 0; i < builder.length(); i++){
            if (builder.lastIndexOf(String.valueOf(builder.charAt(i))) > i){
                builder.deleteCharAt(i);
                i--;
            }
        }
        return builder.toString();
    }
}
