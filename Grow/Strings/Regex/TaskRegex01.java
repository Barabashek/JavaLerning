package Grow.Strings.Regex;

// Cоздать приложение, разбирающее текст (текст хранится в строке) и позволяющее
// выполнять с текстом три различных операции: отсортировать абзацы по количеству
// предложений; в каждом предложении отсортировать слова по длине; отсортировать
// лексемы в предложении по убыванию количества вхождений заданного символа, а в случае равенства – по алфавиту.

import java.util.*;
import java.util.regex.Pattern;

public class TaskRegex01 {
   public static void main(String[] args) throws NoSuchElementException {

       String text = "Часто к недостаткам концепции виртуальной машины относят снижение производительности. Ряд усовершенствований несколько увеличил скорость выполнения программ на Java:\n" +
               "применение технологии трансляции байт-кода в машинный код непосредственно во время работы программы (JIT-технология) с возможностью сохранения версий класса в машинном коде,\n" +
               "обширное использование платформенно-ориентированного кода (native-код) в стандартных библиотеках,\n" +
               "аппаратные средства, обеспечивающие ускоренную обработку байт-кода (например, технология Jazelle, поддерживаемая некоторыми процессорами архитектуры ARM).";
        textChange(text);
    }
    private static void textChange(String string){
        System.out.println("Выберете действие: ");
        System.out.println("1 - сортировка абзацев");
        System.out.println("2 - сортровка слов");
        System.out.println("3 - сортровка лексем");
        System.out.println("exit - завершение работы программы");
        Scanner sc = new Scanner(System.in);
        String make = "";
        while (!make.equalsIgnoreCase("exit")){
            make = sc.nextLine();
            switch (make){
                case "1": sortParagraph(string);
                    break;
                case "2": sortWord(string);
                    break;
                case "3": sortLexem(string);
                    break;
                    default:
                        System.out.println("Повторите ввод команды!\n");
            }
        }
        sc.close();
    }

    private static void sortParagraph(String string){
        String[] paragraphs = string.split("\n");
        int[] sentenceInt = new int[paragraphs.length];
        int paragraphLength = 0;
        for (int i = 0; i < paragraphs.length; i++){
            String[] sentences = splitSentences(paragraphs[i]);
            sentenceInt[i] = sentences.length;
            if (paragraphLength < sentences.length){
                paragraphLength = sentences.length;
            }
        }
        for (int i = 1; i <= paragraphLength; i++){
            for (int j = 0; j < sentenceInt.length; j++){
                if (i == sentenceInt[j]){
                    System.out.println(paragraphs[j]);
                }
            }
        }
        System.out.println();
    }
    private static void sortWord(String string){
        String [] paragraphs = string.split("\n");
        for (String paragraph : paragraphs) {
            String [] sentences = splitSentences(paragraph);
            for (String sentence : sentences) {
                String [] words = splitWords(sentence);

                List<String> list = Arrays.asList(words);
                Collections.sort(list, (o1, o2) -> o1.length() - o2.length());

                /*for (int i = words.length - 1; i >= 0; i--) {
                    for (int j = 0; j < i; j++) {
                        if (words[j].length() > words[j + 1].length()) {
                            String tmp = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = tmp;
                        }
                    }
                }*/


                for (String  word : list) {
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static void sortLexem(String string){
        Pattern patternSentence = Pattern.compile("\\.*[.!?]\\s*");
        Pattern patternWords = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите символ");
        String symbol = sc.nextLine();
        sc.close();

        String[] paragraphs = string.split("\n");
        for (String paragraph : paragraphs){
            String[]sentences = patternSentence.split(paragraph);
            for (String sentence : sentences){
                String[] words = patternWords.split(sentence);

                for (int i = words.length - 1; i >= 0; i--){
                    for (int j = 0; j < i; j++){
                        int countOne = 0;
                        int countTwo = 0;
                        for (int k = 0; k < words[j].length(); k++){
                            if (String.valueOf(words[j].charAt(k)).compareToIgnoreCase(symbol) == 0){
                                countTwo++;
                            }
                        }
                        for (int k = 0; k < words[j + 1].length(); k++){
                            if (String.valueOf(words[j + 1].charAt(k)).compareToIgnoreCase(symbol) == 0){
                                countOne++;
                            }
                        }
                        if (countTwo < countOne){
                            String buff = words[j];
                            words[j] = words[j + 1];
                            words[j + 1] = buff;
                        } else if (countTwo == countOne){
                            String[] comparing = {words[j], words[j + 1]};
                            Arrays.sort(comparing);
                            words[j] = comparing[0];
                            words[j + 1] = comparing[1];
                        }
                    }
                }
                for (String word : words){
                    System.out.print(word + " ");
                }
                System.out.print("\b. ");
            }
            System.out.println();
        }
        System.out.println();
    }
    private static String [] splitSentences(String text) {
        Pattern pattern = Pattern.compile("\\.*[.!?]\\s*");
        return pattern.split(text);
    }

    private static String [] splitWords(String sentence) {
        Pattern pattern = Pattern.compile("\\s*(\\s|,|;|:)\\s*");
        return pattern.split(sentence);
    }
}
