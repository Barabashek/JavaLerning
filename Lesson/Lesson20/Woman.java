package Lesson.Lesson20;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Woman {

    public int age;
    public int childrenCount;
    public int weight;
    public int height;
    public String name;

    public Woman(int age, int childrenCount, int weight, int height, String name) {
        this.age = age;
        this.childrenCount = childrenCount;
        this.weight = weight;
        this.height = height;
        this.name = name;
    }

    public static void main(String[] args) {

        ArrayList<Woman> women = new ArrayList<>();
        women.add(new Woman(18,0,45,170, "Ann"));
        women.add(new Woman(21,1,57,168, "Iren"));
        women.add(new Woman(5,0,20,110, "Angel"));

        Comparator<Woman> compareByHeight = new Comparator<Woman>() {
            @Override
            public int compare(Woman o1, Woman o2) {
                return o1.height - o2.height;
            }
        };

        Comparator<Woman> compareByName = new Comparator<Woman>() {
            @Override
            public int compare(Woman o1, Woman o2) {
                return o1.name.compareTo(o2.name);
            }
        };

        Collections.sort(women, compareByHeight);


    }
}
