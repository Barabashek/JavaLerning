package People;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.List;

public class People {
    public static final List<Person> PEOPLE = new ArrayList<Person>();

    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new FileReader(args[0]));
        String s;
        while (bf.ready()){
          s = bf.readLine();
          String name = s.replaceAll("[\\w]", "").trim();
          String[] value = s.substring(name.length()).trim().split(" ");
          int day = Integer.parseInt(value[0]);
          int month = Integer.parseInt(value[1]);
          int year = Integer.parseInt(value[2]);
          Date date = new GregorianCalendar(year, month-1,day).getTime();

          PEOPLE.add(new Person(name, date));
        }
        bf.close();
    }
}
