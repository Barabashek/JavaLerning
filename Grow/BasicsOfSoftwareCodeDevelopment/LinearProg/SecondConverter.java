package Grow.BasicsOfSoftwareCodeDevelopment.LinearProg;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalTime;

public class SecondConverter {
    public static String convert(int sec){
        return String.format("%d:%02d:%02d", sec/3600, sec%3600/60, sec%60);
    }
    public static void main(String[] args) {

        BufferedReader rd = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Укажите количество секунд: ");
        try{
            int seconds = Integer.parseInt(rd.readLine());
            System.out.println(LocalTime.ofSecondOfDay(seconds)); //Ковертация секунд в пределах одного дня
            System.out.println("HH:MM:SS" + ": " + convert(seconds)); //Конвертация произвольного количества секунд
        } catch (IOException e){e.printStackTrace();}
    }
}
