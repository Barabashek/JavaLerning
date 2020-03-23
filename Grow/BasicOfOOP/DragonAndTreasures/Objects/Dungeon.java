package Grow.BasicOfOOP.DragonAndTreasures.Objects;

import Grow.BasicOfOOP.DragonAndTreasures.Actions.TreasureDoing;

import java.util.List;

public class Dungeon {
    private String name;
    private int treasureNumber;
    private List<Treasure> treasures;
    private TreasureDoing treasureDoing;

    public Dungeon(String name) {
        this.name = name;
        this.treasureNumber = 0;
        treasureDoing = new TreasureDoing();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getTreasureNumber() {
        return treasureNumber;
    }

    public void setTreasureNumber(int treasureNumber) {
        this.treasureNumber = treasureNumber;
        this.treasures = treasureDoing.fillDungeon(treasureNumber);
    }

    public List<Treasure> getTreasures() {
        return treasures;
    }
}
