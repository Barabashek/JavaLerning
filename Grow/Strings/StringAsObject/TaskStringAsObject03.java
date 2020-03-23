package Grow.Strings.StringAsObject;

//Проверить, является ли заданное слово палиндромом.

public class TaskStringAsObject03 {
    public static void main(String[] args) {
        String[] string = {"madam", "java", "Ara", "Dovod", "PokerFace"};

        for (String s : string)
            System.out.println(isPalindrome(s));
    }
    private static boolean isPalindrome(String string){
        if (string == null)
            return false;
        StringBuilder builder = new StringBuilder(string);
        builder.reverse();
        return builder.toString().equalsIgnoreCase(string);
    }
    /*
     private static boolean isPalindrome(String string) {
        if (str == null)
            return false;
        int length = str.length();
        for (int i = 0; i < length / 2; i++) {
            if (str.charAt(i) != str.charAt(length - i - 1))
                return false;
        }
        return true;
    }
     */

}
