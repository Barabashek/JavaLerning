package Grow.BasicOfOOP.DragonAndTreasures.Objects;

public class Jewel extends Treasure{
    private String treasureSpecification;

    public Jewel(String name, int val, String treasureSpecification) {
        super.setName(name);
        super.setVal(val);
        this.treasureSpecification = treasureSpecification;
    }

    @Override
    public String getTreasureSpecification() {
        return null;
    }

    @Override
    public void setTreasureSpecification(String treasureSpecification) {

    }

    @Override
    public String toString() {
        String information = String.format("%-15s %-40s value: %-5d specification: %-40s", "Jewel:", super.getName(), super.getVal(), treasureSpecification);
        return information;
    }
}
