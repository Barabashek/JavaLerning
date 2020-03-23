package Grow.Strings.StringAsObject;

//Подсчитать, сколько раз среди символов заданной строки встречается буква “а”.

public class TaskStringAsObject05 {
    public static void main(String[] args) {
        String string = "Sed ut perspiciatis, unde omnis iste natus error sit voluptatem \n"+
                " accusantium doloremque laudantium, totam rem aperiam eaque ipsa,\n"+
                " quae ab illo inventore veritatis et quasi architecto beatae vitae dicta sunt, explicabo.";
        System.out.println(findLetter(string));
    }
    private static int findLetter(String string){
        int count = 0;
        for (int i = 0; i < string.length(); i++){
            if (string.charAt(i) == 'a') count++;
        }
        return count;
    }
}
