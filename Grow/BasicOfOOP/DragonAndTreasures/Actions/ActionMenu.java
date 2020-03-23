package Grow.BasicOfOOP.DragonAndTreasures.Actions;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class ActionMenu {
    private Scanner scanner = new Scanner(System.in);

    public void printActionList(){
        String textMenu = "Change action: \n" +
                "1 - See all the wealth\n" +
                "2 - Choose the most expensive jewel\n" +
                "3 - Select treasures for a given amount\n" +
                "4 - Exit";
        System.out.println(textMenu);
    }
    public int doSelect(){
        int select;
        try {
            select = Integer.parseInt(scanner.nextLine());
            if (select > 4 || select < 1){
                System.out.println("No such. Retry again");
                printActionList();
            } else {
                return select;
            }
        } catch (NumberFormatException e){
            System.out.println("Wrong input.\n");
            printActionList();
        }
        return -1;
    }
    public boolean choiceOperation(int select){
        TreasureDoing doing = new TreasureDoing();
        switch (select){
            case 1:
                System.out.println("See all the jewels in the dungeon ");
                doing.SeeAllTheWealth();
                break;
            case 2:
                System.out.println("Choose the most expensive jewel");
                doing.selectMostExpensive();
                break;
            case 3:
                int [] treasureAmount = new int[2];
                boolean isFalse = false;
                while (!isFalse){
                    System.out.println("Select treasures for a given amount");
                    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                    try{
                        treasureAmount[0] = Integer.parseInt(reader.readLine());
                        treasureAmount[1] = Integer.parseInt(reader.readLine());
                        isFalse = true;
                    } catch (IOException e){
                        System.out.println("Wrong input. Retry again");
                    }
                }
                System.out.printf("Jewels value from %d to %d:", treasureAmount[0], treasureAmount[1]);
                doing.selectPerAmount(treasureAmount);
                break;
            case 4:
                System.out.println("Exit out Program. See you!");
                return true;
        }
        return false;
    }
}
