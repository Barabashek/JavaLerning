package Reflection;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class CodeAnalizer {
    public static void analizeClass(Object o){

        Class clazz = o.getClass();
        System.out.println("Class name " + clazz);
        System.out.println("Value class " + Arrays.toString(clazz.getDeclaredFields()));
        System.out.println("Parent class " + clazz.getSuperclass());
        System.out.println("Class methods " + Arrays.toString(clazz.getDeclaredMethods()));
        System.out.println("Class constructor " + Arrays.toString(clazz.getConstructors()));
    }

    public static Cat createCat() throws IOException, IllegalAccessException, InstantiationException, ClassNotFoundException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String className = reader.readLine();

        Class clazz = Class.forName(className);
        Cat cat = (Cat) clazz.newInstance();

        return cat;
    }

    public static Object createObject() throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String className = reader.readLine();

        Class clazz = Class.forName(className);
        Object res = clazz.newInstance();

        return res;
    }
    public static void main(String[] args)  throws IOException, IllegalAccessException, ClassNotFoundException, InstantiationException {
        analizeClass(new Cat("Barsik", 6));
        System.out.println(createCat());
    }
}
