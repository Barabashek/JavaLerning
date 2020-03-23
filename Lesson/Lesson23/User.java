package Lesson.Lesson23;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class User implements Comparable<User> {

    private String name;
    private Integer age;
    private String email;

    public User(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public int compareTo(User o) {
        int comparing = this.name.compareTo(o.name);
        if (comparing == 0)
            comparing = this.age.compareTo(o.age);
        return comparing;
    }

    @Override
    public String toString(){
        return "{" +
                "name=" + name + '\'' +
                ", age=" + age +
                ", email=" + email + '\'' +
                "}";
    }

    public static void main(String[] args) {
        User user = new User("Андрей", 19, "andryha@mail.ru");
        User user2 = new User("Олег", 25, "oleg@mail.ru");
        User user3 = new User("Андрей", 24,"opr@google.com");
        User user4 = new User("Игорь", 16, "igor@mail.ru");
        User user5 = new User("Андрей", 44,"stary@google.com");

        List<User> users = new ArrayList<>();

        users.add(user);
        users.add(user2);
        users.add(user3);
        users.add(user4);
        users.add(user5);

        System.out.println("After sort:");
        for (User u : users){
            System.out.println(u);
        }
        System.out.println();
        System.out.println("Before sort:");
        Collections.sort(users);
        for (User u : users){
            System.out.println(u);
        }
    }
}
