package com.example.uas;
import java.util.ArrayList;
import com.example.uas.resources.BaseStats.*;
import com.example.uas.resources.armies.*;
import com.example.uas.resources.castles.*;
import com.example.uas.resources.heroes.*;

public class Battle {
    java.util.List<Player> players = new ArrayList<>();

    public void MakeArmy(){
        players.add(new Player("Player One", new CavalryCastle()));
        players.get(0).heroes.add(new CavalryHero(50));
        players.get(0).castle.armies.add(new Cavalry(true, true, 5000));

        players.add(new Player("Player Two", new ArcherCastle()));
        players.get(1).heroes.add(new ArcherHero(50));
        players.get(1).castle.armies.add(new Archer(true, true, 10000));

        players.add(new Player("Player Three", new InfantryCastle()));
        players.get(2).heroes.add(new InfantryHero(50));
        players.get(2).castle.armies.add(new Infantry(true, true, 30000));

        players.add(new Player("Player Four", new InfantryCastle()));
        players.get(3).heroes.add(new ArcherHero(50));
        players.get(3).castle.armies.add(new Infantry(false, true, 5000));
        players.get(3).castle.armies.add(new Archer(true, false, 10000));

    }
    public int Battle1(){
        if (players.get(0).castle.armies.get(0).UnitSize*0.6 > players.get(1).castle.armies.get(0).UnitSize*0.9){
            return 1;
        }
        else if (players.get(0).castle.armies.get(0).UnitSize*0.6 < players.get(1).castle.armies.get(0).UnitSize*0.9){
            return 2;
        }
      else{
          return 0;
        }
    }
    public int Battle2(){
        if (players.get(2).castle.armies.get(0).UnitSize*0.9 > (players.get(3).castle.armies.get(0).UnitSize + players.get(3).castle.armies.get(1).UnitSize*0.6)){
            return 1;
        }
        else if (players.get(2).castle.armies.get(0).UnitSize*0.9 < (players.get(3).castle.armies.get(0).UnitSize + players.get(3).castle.armies.get(1).UnitSize*0.6)){
            return 2;
        }
        else{
            return 0;
        }
    }


}
