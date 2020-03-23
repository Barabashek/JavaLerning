package Grow.ProgrammingWithClasses.AgregationAndComposition.DerStaat;

public class City {
    private String name;
    private int quantityCitizen;

    public City(String name, int quantityCitizen) {
        this.name = name;
        this.quantityCitizen = quantityCitizen;
    }

    public String getName() {
        return name;
    }

    public int getQuantityCitizen() {
        return quantityCitizen;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setQuantityCitizen(int quantityCitizen) {
        this.quantityCitizen = quantityCitizen;
    }

    public String toString(){
        return name;
    }
}
