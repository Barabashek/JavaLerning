package Grow.ProgrammingWithClasses.AgregationAndComposition.DerStaat;

public class District {
    private String districtName;
    private City districtStadt;
    private double area;

    public District(String districtName, City districtStadt, double area) {
        this.districtName = districtName;
        this.districtStadt = districtStadt;
        this.area = area;
    }

    public String getDistrictName() {
        return districtName;
    }

    public void setDistrictName(String districtName) {
        this.districtName = districtName;
    }

    public City getDistrictStadt() {
        return districtStadt;
    }

    public void setDistrictStadt(City districtStadt) {
        this.districtStadt = districtStadt;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }
}
