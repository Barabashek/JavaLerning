package Grow.BasicOfOOP.DragonAndTreasures;

import Grow.BasicOfOOP.DragonAndTreasures.Objects.Dungeon;
import Grow.BasicOfOOP.DragonAndTreasures.Objects.Menu;

public class Main {
    public static Dungeon dragonSmaug = new Dungeon("Dragon Smaug");

    public static void main(String[] args) {
        Menu menu = new Menu();
        dragonSmaug.setTreasureNumber(70);
        menu.runMenu();
    }
}
