package Grow.BasicOfOOP.DragonAndTreasures.Objects;

import Grow.BasicOfOOP.DragonAndTreasures.Actions.ActionMenu;

public class Menu {
    private ActionMenu actionMenu = new ActionMenu();

    public void runMenu(){
        int select;
        boolean isBreak = false;
        actionMenu.printActionList();
        while (!isBreak){
            System.out.println("Select menu item: ");
            select = actionMenu.doSelect();
            isBreak = actionMenu.choiceOperation(select);
        }
    }
}
