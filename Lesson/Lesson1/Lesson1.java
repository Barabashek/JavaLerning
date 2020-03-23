package Lesson.Lesson1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class Lesson1 {
    public static List<String> allLines = new ArrayList<String>();
    public static List<String> forRemoveLines = new ArrayList<String>();

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                allLines = Files.readAllLines(Paths.get(reader.readLine()));
                forRemoveLines = Files.readAllLines(Paths.get(reader.readLine()));

                reader.close();

            Lesson1 lesson1 = new Lesson1();
            lesson1.joinData();

        }


    public void joinData() throws CorruptedDataException {
    if (allLines.containsAll(forRemoveLines)) allLines.removeAll(forRemoveLines);
    else {
        allLines.clear();
        throw new CorruptedDataException();
    }
    }
}