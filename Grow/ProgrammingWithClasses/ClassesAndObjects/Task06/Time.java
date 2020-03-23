package Grow.ProgrammingWithClasses.ClassesAndObjects.Task06;

// Составьте описание класса для представления времени.
// Предусмотрте возможности установки времени и изменения его
// отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений.
// В случае недопустимых значений полей поле устанавливается в значение 0.
// Создать методы изменения времени на заданное количество часов, минут и секунд.

public class Time {
    private int hour;
    private int minutes;
    private int second;

    public Time(int hour, int minutes, int second) {
        setHour(hour);
        setMinutes(minutes);
        setSecond(second);
    }
    public Time(){
        this.hour = 0;
        this.minutes = 0;
        this.second = 0;
    }

    public int getHour() {
        return hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSecond() {
        return second;
    }

    public void setHour(int hour) {
        if (hour > 23 || hour < 0){this.hour = 0;}
        else this.hour = hour;
    }

    public void setMinutes(int minutes) {
        if (minutes > 59 || minutes < 0){this.minutes = 0;}
        else this.minutes = minutes;
    }

    public void setSecond(int second) {
        if (second > 59 || second < 0){this.second = 0;}
        else this.second = second;
    }
    public void setNewHour(int hour){
        this.hour = (this.hour + hour) % 24;
        if (this.hour < 0) this.hour += 24;
    }
    public void setNewMinutes(int minutes){
        if ((this.minutes + minutes) < 0) {
            setNewHour(minutes/60 - 1);
            this.minutes = 60 + ((this.minutes + minutes) % 60);
        } else {
            setNewHour((this.minutes + minutes) / 60);
            this.minutes = (this.minutes + minutes) % 60;
        }
    }
    public void setNewSeconds(int second){
        if ((this.second + second) < 0){
            setNewMinutes(second/60 - 1);
            this.second = 60 + ((this.second + second) % 60);
        } else {
            setNewMinutes((this.second + second)/60);
            this.second = (this.second + second)%60;
        }
    }
    public String printTime(){
        return String.format("%d:%d:%d", hour, minutes, second);
    }
}
