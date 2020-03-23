package Grow.ProgrammingWithClasses.AgregationAndComposition.TravelPackages;

public enum TypeOfFood {
    NOT_ENCLUDED,
    BREAKFAST,
    ALL_INCLUSIVE;

    public String toString(){
        return super.toString().replace("_", " ").toLowerCase();
    }
}
