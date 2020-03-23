import java.io.FileInputStream;
import java.io.IOException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;



public class LetterCount {
    public static void main(String[] args) throws IOException {

        FileInputStream fileInputStream = new FileInputStream(args[0]);
        int i;
        int count = 0;
        Pattern pattern = Pattern.compile("[a-zA-Z]+");

        while ((i = fileInputStream.read())!= -1){
            char ch = (char)i;
            if (Character.isLetter(ch)){
                Matcher matcher =pattern.matcher(Character.toString(ch));
                if (matcher.matches()) count++;
            }
        }
        System.out.println(count);
        fileInputStream.close();
    }
}