package Grow.ProgrammingWithClasses.ClassesAndObjects.Task04;

// Создайте класс Train, содержащий поля: название пункта назначения,
// номер поезда, время отправления. Создайте данные в массив из пяти элементов типа Train,
// добавьте возможность сортировки элементов массива по номерам поездов.
// Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
// Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми
// пунктами назначения должны быть упорядочены по времени отправления.

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class Train implements Comparable<Train> {
    private String lastStation;
    private String trainNumber;
    private Date departureTime;
    private static SimpleDateFormat dt = new SimpleDateFormat("HH:mm");

    public Train(String lastStation, String trainNumber, Date departureTime) {
        this.lastStation = lastStation;
        this.trainNumber = trainNumber;
        this.departureTime = departureTime;
    }

    public String getLastStation() {
        return lastStation;
    }

    public String getTrainNumber() {
        return trainNumber;
    }

    public Date getDepartureTime() {
        return departureTime;
    }

    public void setLastStation(String lastStation) {
        this.lastStation = lastStation;
    }

    public void setTrainNumber(String trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setDepartureTime(Date departureTime) {
        this.departureTime = departureTime;
    }
    private static void SortByNumber(Train[] trains){
        Arrays.sort(trains);
    }

    private static void SortByStation(Train[] trains){
        Arrays.sort(trains, Train.TrainStationComparator);
    }

    public String toString(){
        StringBuilder builder = new StringBuilder();
        builder.append("Train {");
        builder.append("To Station: ");
        builder.append(lastStation);
        builder.append(", Number: ");
        builder.append(trainNumber);
        builder.append(", time departure: ");
        builder.append(dt.format(departureTime));
        builder.append("}");
        return builder.toString();
    }
    public static String printQuestionInformation(Train[] trains, String trainNumber){
        for (Train train : trains)
            if (train.trainNumber.equalsIgnoreCase(trainNumber))
                return train.toString();
        return trainNumber;
    }

    public static Comparator<Train> TrainStationComparator = (t1, t2) -> {
        String station1 = t1.getLastStation().toUpperCase();
        String station2 = t2.getLastStation().toUpperCase();
        int result = station1.compareTo(station2);
        if (result == 0)
            return t1.departureTime.compareTo(t2.departureTime);
        return result;
    };

    @Override
    public int compareTo(Train o) {
        String compareNumber = ((Train)o).getTrainNumber();
        return this.trainNumber.compareToIgnoreCase(compareNumber);
    }

    public static void main(String[] args) throws ParseException {
        Train [] trains = new Train[5];
        trains[0] = new Train("Vienna", "001C", dt.parse("20:48"));
        trains[1] = new Train("Moscow", "030Y", dt.parse("12:00"));
        trains[2] = new Train("Minsk", "025B", dt.parse("01:44"));
        trains[3] = new Train("Warsaw", "013M", dt.parse("09:56"));
        trains[4] = new Train("Vienna", "296C", dt.parse("16:44"));

        SortByNumber(trains);
        for (Train train : trains)
            System.out.println(train.trainNumber);
        System.out.println();
        SortByStation(trains);
        for (Train train : trains)
            System.out.println(train.lastStation + " " + train.trainNumber + " " + dt.format(train.departureTime));

        String userQuestion = "001C";
        System.out.printf("%nTrain № %s ", userQuestion);
        System.out.println();
        System.out.println(printQuestionInformation(trains, userQuestion));

    }
}
