package Grow.Strings.StringAsObject;

//Посчитать количество строчных (маленьких) и прописных (больших) букв в введенной строке. Учитывать только английские буквы.

public class TaskStringAsObject09 {
    public static void main(String[] args) {
        String string = "BiCapitalization\n" +
                "BumpyCaps\n" +
                "BumpyCase\n" +
                "CamelCaps\n" +
                "CamelHumpedWord\n" +
                "CapWords\n" +
                "ClCl (Capital-lower Capital-lower) иногда ClC\n" +
                "CoolCaps\n" +
                "HumpBackNotation";
        int countLowerCase = 0;
        int countUpperCase = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) >= 'a' && string.charAt(i) <= 'z') countLowerCase++;
            if (string.charAt(i) >= 'A' && string.charAt(i) <= 'Z') countUpperCase++;
        }
        System.out.printf("countLowerCase %d, countUpperCase %d",countLowerCase, countUpperCase);
    }
}
