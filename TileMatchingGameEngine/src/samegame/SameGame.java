package samegame;
import tmge.logic.*;
import tmge.*;

public class SameGame {
    public static void main(String[] args) {
        TMGE tmge = new TMGE(10, 10, 2);
        tmge.setSpawnLogic(new FullSpawn());
        tmge.setMatchingLogic(new NeighborMatching());
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
