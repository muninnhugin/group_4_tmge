package bejeweled;
import java.util.ArrayList;
import java.util.List;

import tmge.TMGE;
import tmge.logic.*;

public class Bejeweled {
    public static void main(String[] args) {
        TMGE tmge = new TMGE(5, 5, 1);
        tmge.setSpawnLogic(new EmptySpawn());
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
