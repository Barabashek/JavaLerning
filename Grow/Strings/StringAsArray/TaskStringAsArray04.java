package Grow.Strings.StringAsArray;

//В строке найти количество чисел.

public class TaskStringAsArray04 {
    public static void main(String[] args) {
        String string = "Последовательность простых чисел начинается так:\n" +
                "2, 3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43,\n" +
                "47, 53, 59, 61, 67, 71, 73, 79, 83, 89, 97, 101, 103,\n"+
                " 107, 109, 113, 127, 131, 137, 139, 149, 151, 157,\n"+
                " 163, 167, 173, 179, 181, 191, 193, 197, 199";
        System.out.println(contNumbers(string));
    }
    public static int contNumbers(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (isDigit(string.charAt(i))){
                if ((i == string.length() - 1) || !isDigit(string.charAt(i + 1)))
                        count++;
            }
        }
        return count;
    }
    public static boolean isDigit(char ch){
        return Character.isDigit(ch);
    }
}
