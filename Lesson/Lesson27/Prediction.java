package Lesson.Lesson27;

import java.util.Random;

public class Prediction {
    private static Random rnd = new Random(47);
    private boolean shadow = rnd.nextDouble() > 0.5;
    public String toString(){
        if (shadow)
            return "Six more weeks of Winter";
        else
            return "Early Spring!";
    }
}
