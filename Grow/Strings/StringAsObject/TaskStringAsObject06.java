package Grow.Strings.StringAsObject;

//Из заданной строки получить новую, повторив каждый символ дважды.

public class TaskStringAsObject06 {
    public static void main(String[] args) {
        String string = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem \n"+
                " accusantium doloremque laudantium, totam rem aperiam eaque ipsa,\n"+
                " quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo.";

        StringBuilder builder = new StringBuilder(string);
        String out = "";

        for (int i = 0; i < builder.length(); i++){
            char ch = builder.charAt(i);
            out = out + ch + ch;
        }
        System.out.print("\n" + out);
    }
}
