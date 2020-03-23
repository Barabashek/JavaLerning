package Lesson.Lesson10;

import java.lang.reflect.Field;

public class B {
    public static void main(String[] args) throws Exception {
        String value = "Old value";
        System.out.println(value);

        Field field = value.getClass().getDeclaredField("value");
        field.setAccessible(true);
        field.set(value, "JavaRush".toCharArray());
        System.out.println(value);
    }
}
