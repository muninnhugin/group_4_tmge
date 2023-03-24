package samegame;
import tmge.logic.*;
import tmge.*;

import java.util.List;

public class SameGame {
    public static void main(String[] args) {
        TMGE tmge = new TMGE(5, 5, 1);
        tmge.setSpawnLogic(new FullSpawn());
        tmge.setMatchingLogic(List.of(new NeighborMatching()));
        tmge.setDestructionLogic(new GravityDestructionLogic(false));
        tmge.setEndLogic(new TurnLimitEndLogic());
        tmge.setMoveLogic(new SGMoveLogic());
        try {
            tmge.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
