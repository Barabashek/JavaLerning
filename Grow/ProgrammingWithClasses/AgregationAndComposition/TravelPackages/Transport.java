package Grow.ProgrammingWithClasses.AgregationAndComposition.TravelPackages;

public enum Transport {
    TRAIN,
    PLANE,
    SHIP,
    BUS,
    AUTO;

    public String toString(){
        return super.toString().toLowerCase();
    }
}
