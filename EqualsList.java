import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

/*
Отслеживаем изменения
*/

public class EqualsList {

    public static List<LineItem> lines = new ArrayList<LineItem>();
    public static ArrayList<String> first = new ArrayList<String>();
    public static ArrayList<String> second = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        String oneStr, twoStr;

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String fileNameOne = bf.readLine();
        String fileNameTwo = bf.readLine();
        bf.close();

        //FileReader readerOne = new FileReader(fileNameOne);
        //FileReader readerTwo = new FileReader(fileNameTwo);
        BufferedReader readerOne = new BufferedReader(new FileReader(fileNameOne));
        BufferedReader readerTwo = new BufferedReader(new FileReader(fileNameTwo));

        while ((oneStr = readerOne.readLine()) != null){
            first.add(oneStr);
        }
        while ((twoStr = readerTwo.readLine())!= null){
            second.add(twoStr);
        }
        readerOne.close();
        readerTwo.close();

      /*  for (int i = 0; i < lines.size(); i++){
            if (first.get(i).equals(second.get(i))){
                lines.add(new LineItem(Type.SAME, second.get(i)));
                first.set(i, null);
            } else if (!first.get(i).equals(second.get(i)) && first.get(i).equals(second.get(i + 1))){
                lines.add(new LineItem(Type.ADDED, second.get(i)));
                second.remove(i);
            } else if (!first.get(i).equals(second.get(i)) && !first.get(i).equals(second.get(i + 1))){
                lines.add(new LineItem(Type.REMOVED, first.get(i)));
                second.add(0, null);
            }
        }*/

        for (int i = 0; i < lines.size(); i++){

            if (first.get(i).equals(second.get(i))){
                lines.add(new LineItem(Type.SAME, first.get(i)));
                first.remove(i);
                second.remove(i);
            } else if (!first.get(i).equals(second.get(i)) && first.get(i).equals(second.get(i + 1))){
                lines.add(new LineItem(Type.ADDED, second.get(i)));
                second.remove(i);
            } else if (!first.get(i).equals(second.get(i)) && !first.get(i).equals(second.get(i + 1))){
                lines.add(new LineItem(Type.REMOVED, first.get(i)));
                second.remove(i);
            }
        }

    }

    public static enum Type {
        ADDED,        //добавлена новая строка
        REMOVED,      //удалена строка
        SAME          //без изменений
    }

    public static class LineItem {
        public Type type;
        public String line;

        public LineItem(Type type, String line) {
            this.type = type;
            this.line = line;
        }
    }
}
