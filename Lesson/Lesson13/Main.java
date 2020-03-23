package Lesson.Lesson13;

abstract class Base{
    public Base(int i){
        System.out.println("Base constructor, i = " + i);
    }
    public abstract void f();
}

public class Main {
    public static Base getBase(int i){
        return new Base(i) {
            {
                System.out.println("In initializing example");
            }
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
