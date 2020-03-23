package Grow.BasicOfOOP.DragonAndTreasures.Objects;

public class Weapon extends Treasure {
    private String treasureSpecification;

    public Weapon(String name, int val, String treasureSpecification) {
        super.setName(name);
        super.setVal(val);
        this.treasureSpecification = treasureSpecification;
    }

    @Override
    public String getTreasureSpecification() {
        return treasureSpecification;
    }

    @Override
    public void setTreasureSpecification(String treasureSpecification) {
        this.treasureSpecification = treasureSpecification;
    }

    @Override
    public String toString() {
        String information = String.format("%-15s %-40s value: %-5d specification: %-40s", "Weapon:", super.getName(), super.getVal(), treasureSpecification);
        return information;
    }
}
