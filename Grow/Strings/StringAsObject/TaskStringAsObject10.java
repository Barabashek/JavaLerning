package Grow.Strings.StringAsObject;

// Строка X состоит из нескольких предложений, каждое из которых кончается точкой,
// восклицательным или вопросительным знаком. Определить количество предложений в строке X.

public class TaskStringAsObject10 {
    public static void main(String[] args) {
        String string = "Библиотека Accessibility.\n" +
                "Java 2D.\n" +
                "Поддержка технологии drag-and-drop.\n" +
                "Полная поддержка Unicode, включая поддержку ввода на японском, китайском и корейском языках.\n" +
                "Поддержка воспроизведения аудиофайлов нескольких популярных форматов.\n" +
                "Полная поддержка технологии CORBA.\n" +
                "JIT-компилятор, улучшенная производительность.\n" +
                "Усовершенствования инструментальных средств JDK, в том числе поддержка профилирования Java-программ.";
        System.out.println(sentenceCounter(string));
    }
    private static int sentenceCounter(String string){
        int countSentence = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == '.' || string.charAt(i) == '!' || string.charAt(i) == '?') countSentence++;
        }
        return countSentence;
    }
}
