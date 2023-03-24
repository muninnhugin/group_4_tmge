package bejeweled;
import java.util.List;
import java.util.Scanner;

import tmge.TMGE;
import tmge.logic.*;

public class Bejeweled {
    public static void main(String[] args) {
        System.out.println("---------Bejeweled---------");
        TMGE tmge = new TMGE(5, 5, 1);
        System.out.println("\n     Game start!\n");
        tmge.setSpawnLogic(new FullSpawn());
        tmge.setMatchingLogic(List.of(new HorizontalMatching(3), new VerticalMatching(3)));
        tmge.setDestructionLogic(new GravityDestructionLogic(true));
        tmge.setEndLogic(new TurnLimitEndLogic());
        tmge.setMoveLogic(new BejeweledMoveLogic());
        try {
            tmge.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
