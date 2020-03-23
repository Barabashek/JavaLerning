package AdapterSc;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

/*
И еще один адаптер
*/

public class Main {

    public static void main(String[] args) {

    }

    public static class PersonScannerAdapter implements PersonScanner {
        private final Scanner fileScanner;

        public PersonScannerAdapter(Scanner fileScanner){
            this.fileScanner = fileScanner;
        }


        @Override
        public Person read() throws IOException, ParseException {
            Date date = new Date();
            String line = fileScanner.nextLine();
            String[]array = line.split("\\s", 4);
            date = new SimpleDateFormat("d M y", Locale.ENGLISH).parse(array[3]);
            return new Person(array[1], array[2], array[0], date);
        }

        @Override
        public void close() throws IOException {
            fileScanner.close();
        }
    }
}
