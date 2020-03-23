package Grow.Strings.StringAsArray;

//Замените в строке все вхождения 'word' на 'letter'.

public class TaskStringAsArray02 {
    public static void main(String[] args) {
        String string = "Microsoft word (часто — MS word, Win word или просто word)";
        //String newStr = replaceWord(string);

        System.out.println(string);
        System.out.println(string.replaceAll("word", "letter"));
    }
    /*private static String replaceWord(String str){
        StringBuilder builder = new StringBuilder();
        String[] strings = str.split(" ");
        for (int i = 0; i < strings.length; i++){
            if (strings[i].equals("word"))
                strings[i] = "letter";
            builder.append(strings[i] + " ");
        }
        return builder.toString();


        private static String replaceWord(String str){
        StringBuilder builder = new StringBuilder();
        String newStr;
        for (int i = 0; i < str.length(); i++){
            if (i + 3 < str.length() && str.charAt(i) == 'w'
                    && str.charAt(i+1) == 'o'
                    && str.charAt(i + 2) == 'r'
                    && str.charAt(i + 3) == 'd'){
                builder.append("letter");
                i += 3;
            } else
                builder.append(str.charAt(i));
        }
        newStr = builder.toString();
        return newStr;}*/
}
