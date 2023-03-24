import java.util.ArrayList;
import java.util.List;

import tmge.TMGE;
import tmge.logic.*;

public class Bejeweled {
    public static void main(String[] args){
        TMGE tmge = new TMGE(5, 5, 1);
        tmge.setSpawnLogic(new FullSpawn());
        tmge.setMatchingLogic(List.of(new HorizontalMatching(3), new VerticalMatching(3)));
        tmge.setDestructionLogic(new GravityDestructionLogic());
        tmge.setEnd(false);
        tmge.setMoveLogic(null);
        try{
            tmge.run();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
    
}
