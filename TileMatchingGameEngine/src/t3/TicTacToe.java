package t3;

import tmge.*;
import tmge.logic.*;
import java.util.*;

public class TicTacToe {
    public static void main(String[] args) {
        TMGE tmge = new TMGE(3, 3, 2);
        tmge.setSpawnLogic(new EmptySpawn());
        tmge.setMatchingLogic(List.of(new HorizontalMatching(3), new VerticalMatching(3)));
        tmge.setDestructionLogic(new T3Destruction());
        tmge.setEndLogic(new EmptyEnd());
        tmge.setMoveLogic(new T3MoveLogic());
        try {
            tmge.run();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
