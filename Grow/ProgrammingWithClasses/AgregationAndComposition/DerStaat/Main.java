package Grow.ProgrammingWithClasses.AgregationAndComposition.DerStaat;

public class Main {
    public static void main(String[] args) {
        Staat ireland = new Staat("Ireland", new City("Dublin", 1347359));

        ireland.addRegion(new Region("Fingal", new City("Sords", 196000), 448));
        ireland.addRegion(new Region("Dublin", new City("Dublin", 1347359), 115));
        ireland.addRegion(new Region("Meath", new City("Navan", 184135), 2342));
        ireland.addRegion(new Region("Waterford", new City("Waterford", 113795), 1857));
        ireland.addRegion(new Region("Mayo", new City("Caslbar", 130638), 5586));

        ireland.printCapital();
        ireland.regionQuantity();
        ireland.printRegionCentre();
        System.out.println("Area Ireland = " + ireland.areaOfCountry());
    }
}
