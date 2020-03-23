package Lesson.Lesson7;


import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Solution {
    public static void main(String[] args) {
        String text = "25–26 октября, Санкт-Петербург: конференция Joker 2019";
        Pattern p = Pattern.compile("\\d");
        Matcher m;
        int count = 0;
        for (int i = 0; i < text.length(); i++){
            m = p.matcher(String.valueOf(text.charAt(i)));
            if (m.matches()) count++;
        }
        System.out.println(count);
    }
}
/*Дана строка. Разделить строку на фрагменты по три подряд идущих символа.
В каждом фрагменте средний символ заменить на случайный символ,
не совпадающий ни с одним из символов этого фрагмента.
Показать фрагменты, упорядоченные по алфавиту.*/
