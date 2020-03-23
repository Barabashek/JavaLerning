package Grow.ProgrammingWithClasses.AgregationAndComposition.Car;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("BMV X5", null);
        System.out.println(car.getModel());
        car.setFuel(true);
        car.setWheels();
        car.setEngine(new Engine(3.0, 245));
        car.carGo();
    }
}
