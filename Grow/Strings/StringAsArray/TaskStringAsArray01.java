package Grow.Strings.StringAsArray;

//Дан массив названий переменных в camelCase. Преобразовать названия в snake_case.

public class TaskStringAsArray01 {
    public static void main(String[] args) {
        String[] strings = {"superChars", "intToString", "someNumber", "charToInt"};
        String[] newStrings = snakeCase(strings);

        System.out.println(String.join(", ", strings));
        System.out.println(String.join(", ", newStrings));
    }
    private static String[] snakeCase(String[] array){
        String[] strings = new String[array.length];
        for (int i = 0; i < strings.length; i++){
            StringBuilder builder = new StringBuilder();
            for (int j = 0; j < array[i].length(); j++){
                char ch = array[i].toCharArray()[j];
                if (Character.isLowerCase(ch))
                    builder.append(ch);
                else {
                    builder.append("_");
                    builder.append(Character.toLowerCase(ch));
                }
            }
            strings[i] = builder.toString();
        }
        return strings;
    }
}
