package Grow.ProgrammingWithClasses.AgregationAndComposition.TravelPackages;

public enum TypeTravelPackage {
    RECREATION,
    EXCURSIONS,
    TREATMENT,
    SHOPPING,
    CRUISE;

    public String toString(){
        return super.toString().toLowerCase();
    }
}
