package Grow.BasicOfOOP.DragonAndTreasures.Actions;

import Grow.BasicOfOOP.DragonAndTreasures.Main;
import Grow.BasicOfOOP.DragonAndTreasures.Objects.*;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class TreasureDoing {
    public void SeeAllTheWealth(){
        int id = 1;
        for (Treasure treasure : Main.dragonSmaug.getTreasures()){
            String s = String.format("%-3d %-100s\n", id++, treasure);
            System.out.println(s);
        }
        System.out.println();
    }
    public void selectMostExpensive(){
        int moreCheck = 0;
        Treasure treasure = null;
        for (Treasure trs : Main.dragonSmaug.getTreasures()){
            if (trs.getVal() > moreCheck){
                moreCheck = trs.getVal();
                treasure = trs;
            }
        }
        System.out.println(treasure + "\n");
    }
    public void selectPerAmount(int [] amountValue){
        List<Treasure> treasures = Main.dragonSmaug.getTreasures().stream()
                .filter(trs -> trs.getVal() >= amountValue[0] && trs.getVal() <= amountValue[1]).collect(Collectors.toList());
        if (treasures.size() == 0){
            System.out.println("No action");
            return;
        }
        int id = 1;
        for (Treasure trs : treasures){
            System.out.printf("$-3d %-100s", id++, trs);
        }
        System.out.println();
    }
    public List<Treasure> fillDungeon(int trsNumber){
        List<Treasure> treasures = new ArrayList<>();
        try{
            FileReader fileReader = new FileReader("F:\\Project\\src\\Grow\\BasicOfOOP\\DragonAndTreasures\\Information\\treasures.txt");
            BufferedReader reader = new BufferedReader(fileReader);
            while (reader.readLine() != null && trsNumber-- > 0){
                String [] treasureStr = reader.readLine().split(" - ");
                String treasureKind = treasureStr[0];
                String treasureTitle = treasureStr[1];
                int treasureVal = Integer.parseInt(treasureStr[2]);
                String treasureSpecification = treasureStr[3];
                switch (treasureKind){
                    case "Precious Pendant":
                        treasures.add(new PreciousPendant(treasureTitle, treasureVal, treasureSpecification));
                        break;
                    case "Weapon":
                        treasures.add(new Weapon(treasureTitle, treasureVal, treasureSpecification));
                        break;
                    case "Coin":
                        treasures.add(new Coin(treasureTitle, treasureVal, treasureSpecification));
                        break;
                    case "Jewel":
                        treasures.add(new Jewel(treasureTitle, treasureVal, treasureSpecification));
                        break;
                }
            }
        }catch (IOException e){
            System.out.println("File not found");
        }
        return treasures;
    }
}
