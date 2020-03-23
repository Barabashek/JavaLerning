package Lesson.Lesson21;

import java.util.Comparator;
import java.util.TreeSet;


public class Person{
   private String name;
   private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public static void main(String[] args) {
        Comparator<Person> comparator = new PersonNameComparator().thenComparing(new PersonAgeCompare());
        TreeSet<Person> people = new TreeSet<Person>(comparator);
        people.add(new Person("Tom", 23));
        people.add(new Person("Nick",34));
        people.add(new Person("Tom",10));
        people.add(new Person("Bill",14));

        for (Person p : people)
            System.out.println(p.getName() + " " + p.getAge());
    }
}

class PersonNameComparator implements Comparator<Person>{

    public int compare(Person a, Person b){
        return a.getName().compareTo(b.getName());
    }
}

class PersonAgeCompare implements Comparator<Person>{

    public int compare(Person a, Person b){
        return a.getAge() - b.getAge();
    }
}