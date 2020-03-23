package Grow.ProgrammingWithClasses.AgregationAndComposition.DerStaat;

import java.util.ArrayList;

public class Region {
    private String regionName;
    private City regionStadt;
    private double area;
    private ArrayList<District> districts;

    public Region(String regionName, City regionStadt, double area) {
        this.regionName = regionName;
        this.regionStadt = regionStadt;
        this.area = area;
        districts = new ArrayList<>();
    }

    public String getRegionName() {
        return regionName;
    }

    public void setRegionName(String regionName) {
        this.regionName = regionName;
    }

    public City getRegionStadt() {
        return regionStadt;
    }

    public void setRegionStadt(City regionStadt) {
        this.regionStadt = regionStadt;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public void addDistrict(District district){
        districts.add(district);
    }

    public void deleteDistrict(String nameOfDistrict){
        districts.stream().filter(district -> district.getDistrictName().
                equalsIgnoreCase(nameOfDistrict)).forEach(district -> districts.remove(district));
    }
}
