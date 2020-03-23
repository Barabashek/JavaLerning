package Grow.ProgrammingWithClasses.AgregationAndComposition.Car;

public class Engine {

    private double volume;
    private int power;

    private boolean engineIsStarted = false;

    public Engine(double volume, int power) {
        this.volume = volume;
        this.power = power;
    }

    public double getVolume() {
        return volume;
    }

    public int getPower() {
        return power;
    }

    public void setVolume(double volume) {
        this.volume = volume;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public boolean startEngine(boolean engineIsStarted) {
        if (engineIsStarted) System.out.println("Engine is started");
        return engineIsStarted;
    }

    public boolean stopEngine(boolean engineIsStarted) {
        if (engineIsStarted) System.out.println("Engine is stopped");
        return engineIsStarted;
    }
}