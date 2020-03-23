package Grow.ProgrammingWithClasses.ClassesAndObjects.Task10;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

public class WareHouse {
    ArrayList<AirLine> airLines = new ArrayList<>();

    public WareHouse(ArrayList<AirLine> airLines) {
        this.airLines = airLines;
    }

    public ArrayList<AirLine> getFlightDestination(String dest){
        ArrayList<AirLine> destinations = new ArrayList<>();
        this.airLines.forEach(airLine -> {if (airLine.getDestination().equalsIgnoreCase(dest))
            destinations.add(airLine);});
        return destinations;
    }



    public ArrayList<AirLine> getFlightPerWeekDay(DayOfWeek dayOfWeek){
        ArrayList<AirLine> flightDay = new ArrayList<>();
        this.airLines.forEach(airLine -> {
            Arrays.stream(airLine.getWeekDay()).filter(day -> day == dayOfWeek).map(day -> airLine).forEach(flightDay::add);
        });
        return flightDay;
    }

    public ArrayList<AirLine> getFlightPerTime(DayOfWeek dayOfWeek, Date departureTime){
        ArrayList<AirLine> flightTime = new ArrayList<>();
        this.airLines.forEach(airLine -> {
            Arrays.stream(airLine.getWeekDay()).filter(day -> day == dayOfWeek).filter(day -> airLine.getDepartureTime().compareTo(departureTime) > 0).map(day -> airLine).forEach(flightTime::add);
        });
        return flightTime;
    }

    public void addFlight(String destination, String flightNumber, String flightType, Date departureTime, DayOfWeek[] weekDay){
        airLines.add(new AirLine(destination, flightNumber, flightType, departureTime, weekDay));
    }

    public ArrayList<AirLine> getAirLines() {
        return airLines;
    }

    public void setAirLines(ArrayList<AirLine> airLines) {
        this.airLines = airLines;
    }
}
