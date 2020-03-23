package Grow.ProgrammingWithClasses.ClassesAndObjects.Task10;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;

public class Main {
    public static void main(String[] args) throws ParseException {
        WareHouse wh = new WareHouse(new ArrayList<>());

        wh.addFlight("Praga (Vazlaw Gavel)", "QS-8895", "Airbus A320",
                AirLine.df.parse("17:45"), new DayOfWeek[]{DayOfWeek.MONDAY, DayOfWeek.SATURDAY, DayOfWeek.SUNDAY});
        wh.addFlight("Paris (Bouvet Till)", "W6-7898", "Airbus A320",
                AirLine.df.parse("18:05"), new DayOfWeek[]{DayOfWeek.FRIDAY, DayOfWeek.WEDNESDAY, DayOfWeek.TUESDAY});
        wh.addFlight("Barcelona (El Prat)", "W9-8126", "Airbus A321",
                AirLine.df.parse("13:25"), new DayOfWeek[]{DayOfWeek.SATURDAY, DayOfWeek.THURSDAY, DayOfWeek.FRIDAY});
        wh.addFlight("Vienna (Schwechat)", "UT-821", "Boeing 737-800",
                AirLine.df.parse("17:55"), new DayOfWeek[]{DayOfWeek.THURSDAY, DayOfWeek.SUNDAY, DayOfWeek.WEDNESDAY});
        wh.addFlight("Moscow (Seremetevo)", "N4-362", "Boeing 737-800",
                AirLine.df.parse("12:15"), new DayOfWeek[]{DayOfWeek.EVERYDAY});
        wh.addFlight("New York (J.F.Kennedy)", "SU-100", "Boeing 777-300ER",
                AirLine.df.parse("09:20"), new DayOfWeek[]{DayOfWeek.SUNDAY, DayOfWeek.THURSDAY, DayOfWeek.MONDAY});
        wh.addFlight("Tokiyo (Haneda)", "JL-40", "Boeing 787-8",
                AirLine.df.parse("16:35"), new DayOfWeek[]{DayOfWeek.FRIDAY, DayOfWeek.WEDNESDAY, DayOfWeek.THURSDAY, DayOfWeek.SUNDAY});
        wh.addFlight("Hong Kong", "SU-212", "Boeing 777-300ER",
                AirLine.df.parse("19:20"), new DayOfWeek[]{DayOfWeek.EVERYDAY});

        System.out.println("Список самолетов следующих в аэропорт: New York (J.F.Kennedy)");
        ArrayList<AirLine> flightToNewYork = wh.getFlightDestination("New York (J.F.Kennedy)");
        flightToNewYork.forEach(airLine -> System.out.println(airLine));

        System.out.println();
        System.out.println("Список рейсов выполняемых ежедневно");
        ArrayList<AirLine> flightDeyOfWeek = wh.getFlightPerWeekDay(DayOfWeek.EVERYDAY);
        flightDeyOfWeek.forEach(airLine -> System.out.println(airLine));

        System.out.println();
        System.out.println("Список рейсов выполняемых в пятницу после 14:00");
        Date hour = AirLine.df.parse("14:00");
        ArrayList<AirLine> flightOnFriday = wh.getFlightPerTime(DayOfWeek.FRIDAY, hour);
        flightOnFriday.forEach(airLine -> System.out.println(airLine));
    }
}
