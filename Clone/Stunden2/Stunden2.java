package Clone.Stunden2;

import java.util.Calendar;
import java.util.GregorianCalendar;

class User implements Cloneable{
    private String name;
    private int age;
    private GregorianCalendar birthday;

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public int getAge(){
        return age;
    }
    public void setAge(int age){
        this.age = age;
    }
    public String getBirthday(){
        return birthday.get(Calendar.DAY_OF_MONTH) + "." + birthday.get(Calendar.MONTH) + "." + birthday.get(Calendar.YEAR);
    }
    public void setBirthday(int day, int month, int year){
        birthday = new GregorianCalendar();
        birthday.set(Calendar.DAY_OF_MONTH, day);
        birthday.set(Calendar.MONTH, month);
        birthday.set(Calendar.YEAR, year);
    }
    public User clone() throws CloneNotSupportedException{
        User clone = (User) super.clone();
        clone.birthday = (GregorianCalendar) birthday.clone();
        return clone;
    }
}

public class Stunden2 {
    public static void main(String[] args) {

        User user = new User();
        user.setName("John");
        user.setAge(25);
        user.setBirthday(12, 01, 1984);

        System.out.println("Before cloning: " + user.getName() + " - " + user.getAge() + " years " + user.getBirthday());

        User clone;

        try{
            clone = user.clone();
            clone.setName("Bill");
            clone.setAge(30);
            clone.setBirthday(21, 06, 1990);

            System.out.println("Clone after change data: " + clone.getName() + " - " + clone.getAge() + " years " + clone.getBirthday());
        } catch (CloneNotSupportedException e){
            System.out.println("Object cannot be cloned");
        }
        System.out.println("Оригинал, после манипуляций с клоном: " + user.getName() + " - " + user.getAge() + "лет, день рождение: " + user.getBirthday());
    }
}
