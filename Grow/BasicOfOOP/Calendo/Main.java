package Grow.BasicOfOOP.Calendo;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Main {
    public static void main(String[] args) {
        int year = 2019;
        Calendar calendar = new Calendar(year);
        DateTimeFormatter dateF = DateTimeFormatter.ofPattern("dd.MM.yyyy");

        calendar.addHoliday(LocalDate.parse("01.01." + year, dateF), "New Year");
        calendar.addHoliday(LocalDate.parse("07.01." + year, dateF), "Christmas");
        calendar.addHoliday(LocalDate.parse("23.02." + year, dateF), "Day of Army and Navy");
        calendar.addHoliday(LocalDate.parse("08.03." + year, dateF), "Women`s Day");
        calendar.addHoliday(LocalDate.parse("01.05." + year, dateF), "Day of spring and Labor");
        calendar.addHoliday(LocalDate.parse("09.05." + year, dateF), "Day of Victory");
        calendar.addHoliday(LocalDate.parse("07.11." + year, dateF), "October Revolution Day");

        calendar.printHolidays();

        Calendar.Holiday holiday = calendar.removeHoliday("Christmas");
        System.out.println("\nDeleting " + holiday);
    }
}
