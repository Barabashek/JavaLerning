package Grow.BasicOfOOP.DragonAndTreasures.Objects;

public class PreciousPendant extends Treasure {
    private String treasureSpecification;

    public PreciousPendant(String name, int val, String treasureSpecification) {
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
        String information = String.format("%-15s %-40s value: %-5d specification: %-40s", "Precious Pendant:",super.getName(), super.getVal(), treasureSpecification);
        return information;
    }
}
