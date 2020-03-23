package Grow.BasicOfOOP.Calendo;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;

public class Calendar {
    private int year;
    private ArrayList<Holiday> holidays;

    public Calendar(int year) {
        this.year = year;
        this.holidays = new ArrayList<>();
        addWeek(year);
    }

    private void addWeek(int year){
        LocalDate date = LocalDate.of(year, 1,1);
        while (date.getDayOfWeek() != DayOfWeek.SATURDAY
                && date.getDayOfWeek() != DayOfWeek.SUNDAY){
            date = date.plusDays(1);
        }
        while (date.getYear() == year){
            if (date.getDayOfWeek() == DayOfWeek.SATURDAY){
                holidays.add(new Holiday(date, "Saturday"));
                date = date.plusDays(1);
            }else if (date.getDayOfWeek() == DayOfWeek.SUNDAY){
                holidays.add(new Holiday(date, "Sunday"));
                date = date.plusDays(6);
            } else {date = date.plusDays(1);}
        }
    }

    public void addHoliday(LocalDate holidayDate, String holidayName){
        holidays.add(new Holiday(holidayDate, holidayName));
        holidays.sort(Comparator.comparing((Holiday holiday) -> holiday.getHolidayDate())
                .thenComparing(holiday1 -> holiday1.getHolidayName()));
    }
    public Holiday removeHoliday(String holidayName){
        Holiday deletingHoliday = null;
        Iterator<Holiday> iterator = holidays.iterator();
        while (iterator.hasNext()) {
            Holiday holiday = iterator.next();
            if (holiday.getHolidayName().equals(holidayName)) {
                deletingHoliday = holiday;
                iterator.remove();
            }
        }
        return deletingHoliday;
    }

    public void printHolidays(){
        holidays.forEach(System.out::println);
    }

    class Holiday{
        private LocalDate holidayDate;
        private String holidayName;

        public Holiday(LocalDate holidayDate, String holidayName) {
            this.holidayDate = holidayDate;
            this.holidayName = holidayName;
        }

        public LocalDate getHolidayDate() {
            return holidayDate;
        }

        public String getHolidayName() {
            return holidayName;
        }
        public String toString(){
            StringBuilder builder = new StringBuilder();
            builder.append("Holiday{");
            builder.append(holidayDate.format(DateTimeFormatter.ofPattern("dd.MM.yyyy")));
            builder.append(" - ");
            builder.append(holidayName);
            builder.append("}");
            return builder.toString();
        }
    }
}

