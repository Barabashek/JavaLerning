package Grow.BasicOfOOP.DragonAndTreasures.Objects;

public abstract class Treasure {
    private String name;
    private int val;
    private String treasureSpecification;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public abstract String getTreasureSpecification();

    public abstract void setTreasureSpecification(String treasureSpecification);

    public abstract String toString();
}
