package Grow.ProgrammingWithClasses.ClassesAndObjects.Task10;

//Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы,
//set- и get- методы и метод toString(). Создать второй класс, агрегирующий массив типа Airline,
//с подходящими конструкторами и методами. Задать критерии выбора данных и вывести эти данные на консоль.

//Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.

//Найти и вывести:
//a) список рейсов для заданного пункта назначения;
//b) список рейсов для заданного дня недели;
//c) список рейсов для заданного дня недели, время вылета для которых больше заданного.

import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Date;

public class AirLine {
    private String destination;
    private String flightNumber;
    private String flightType;
    private Date departureTime;
    private DayOfWeek[] weekDay;

    public static SimpleDateFormat df = new SimpleDateFormat("HH:mm");

    public AirLine(String destination, String flightNumber, String flightType, Date departureTime, DayOfWeek[] weekDay) {
        this.destination = destination;
        this.flightNumber = flightNumber;
        this.flightType = flightType;
        this.departureTime = departureTime;
        this.weekDay = weekDay;
    }

    public String getDestination() {
        return destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public String getFlightType() {
        return flightType;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public DayOfWeek[] getWeekDay() {
        return weekDay;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public void setFlightType(String flightType) {
        this.flightType = flightType;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }

    public void setWeekDay(DayOfWeek[] weekDay) {
        this.weekDay = weekDay;
    }

    public String toString(){
        return "Flight {" +
                "Nmber = " + flightNumber +
                "; destination = " + destination +
                "; flight type = " + flightType +
                "; departure time = " + df.format(departureTime) +
                "; day of week = " + Arrays.toString(weekDay) + "}";
    }
}
