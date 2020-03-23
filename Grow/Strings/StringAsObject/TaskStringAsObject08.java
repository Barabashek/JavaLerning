package Grow.Strings.StringAsObject;

// Вводится строка слов, разделенных пробелами. Найти самое длинное слово
// и вывести его на экран. Случай, когда самых длинных слов может быть несколько, не обрабатывать.

public class TaskStringAsObject08 {
    public static void main(String[] args) {
        String string = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem \n"+
                " accusantium doloremque laudantium, totam rem aperiam eaque ipsa,\n"+
                " quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo.";
        System.out.println(largestWord(string));
    }
    private static String largestWord(String string){
        String[] stringArray = string.split(" ");
        String largeWord = "";
        int length = 0;
        for (String s : stringArray){
            for (int i = 0; i < s.length(); i++){
                if (s.length() > length){
                    length = s.length();
                    largeWord = s;
                }
            }
        }
        return largeWord;
    }
}
