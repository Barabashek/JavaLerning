package Grow.ProgrammingWithClasses.AgregationAndComposition.Car;

public class Wheel {
    private int diameter;
    private boolean isGood;



    public Wheel(int diameter) {
        this.diameter = diameter;
        this.isGood = true;
    }

    public int getDiameter() {
        return diameter;
    }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public boolean isGood() {
        return isGood;
    }

    public void setGood() {
        isGood = true;
    }
}
