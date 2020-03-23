package Grow.ProgrammingWithClasses.AgregationAndComposition.DerStaat;

//Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
//столицу, количество областей, площадь, областные центры

import java.util.ArrayList;

public class Staat {
    private String staatName;
    private City capital;
    private ArrayList<Region> regions;

    public Staat(String staatName, City capital) {
        this.staatName = staatName;
        this.capital = capital;
        regions = new ArrayList<>();
    }

    public void printCapital(){
        System.out.printf("The Capital of Country %s is %s.\n", staatName, capital);
    }
    public void regionQuantity(){
        System.out.printf("Number of regions in %s = %d.\n", staatName, this.regions.size());
    }
    public double areaOfCountry(){
        double areaCountry = 0;
        for (Region region : regions){
            areaCountry += region.getArea();
        }
        return areaCountry;
    }
    public void printRegionCentre(){
        System.out.printf("City capital of Regions in %s.\n", staatName);
        regions.stream().map(region -> region.getRegionStadt() + "; ").forEach(System.out::print);
        System.out.println();
    }
    public void addRegion(Region region){
        regions.add(region);
    }
    public void deleteRegion(String regionName){
        regions.stream().filter(region -> region.getRegionName().
                equalsIgnoreCase(regionName)).forEach(region -> regions.remove(region));
    }

    public ArrayList<Region> getRegions() {
        return regions;
    }

    public String getStaatName() {
        return staatName;
    }

    public void setStaatName(String staatName) {
        this.staatName = staatName;
    }

    public City getCapital() {
        return capital;
    }

    public void setCapital(City capital) {
        this.capital = capital;
    }
}
