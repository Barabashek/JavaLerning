package Grow.Strings.StringAsObject;

//В строке вставить после каждого символа 'a' символ 'b'.

public class TaskStringAsObject02 {
    public static void main(String[] args) {
        String string = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem \n"+
                        " accusantium doloremque laudantium, totam rem aperiam eaque ipsa,\n"+
                        " quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo.";
        System.out.println(insertLetter(string));
       // System.out.println(insertLetters(string));
    }
    public static String insertLetter(String string){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == 'a'){
                builder.append("ab");
            }else {
                builder.append(string.charAt(i));
            }
        }
        return builder.toString();
    }
   /* public static String insertLetters(String string){
        return string.replaceAll("a", "ab");
    }*/
}
