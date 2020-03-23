package Grow.ProgrammingWithClasses.AgregationAndComposition.Car;

//Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
//менять колесо, вывести на консоль марку автомобиля.

import java.util.Arrays;

public class Car {
    private String model;
    private Engine engine;
    private Wheel[] wheels;
    private boolean isFuel;



    public Car(String model, Engine engine) {
        this.model = model;
        this.engine = engine;
        this.wheels = new Wheel[4];
        this.isFuel = true;
    }

    public String getModel() {
        return model;
    }

    public Wheel[] getWheels() {
        return wheels;
    }

    public void setWheels() {
        for (int i = 0; i < 4; i++){
            wheels[i] = new Wheel(19);
        }
        //this.wheels = wheels;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
        System.out.println("Engine installed");
    }

    public Engine getEngine() {
        return engine;
    }

    public boolean getisFuel() {
        return isFuel;
    }

    public void setFuel(boolean fuel) {
        isFuel = fuel;
    }

    public Wheel replaceWheel(Wheel wheel){
        wheel = new Wheel(wheel.getDiameter());
        System.out.println("Wheel replaced");
        return wheel;
    }
    public void refuelCar(){
        this.isFuel = true;
        System.out.println("Refueled");
    }
    public void carGo(){
        for (int i = 0; i < wheels.length; i++) {
            if (wheels[i] == null) {
                replaceWheel(new Wheel(19));
            } else System.out.println("Wheel is Good");
        }
        if (engine == null){
            System.out.println("Need install Engine");
            setEngine(new Engine(3.0, 245));
        } else {
            System.out.println("Engine is Ready");}
        if (!isFuel){
            System.out.println("Need refueled Car");
            refuelCar();
            engine.startEngine(false);
        } else System.out.println("Fuel is full");
            engine.startEngine(true);
            System.out.println("The Car went");
    }
}
