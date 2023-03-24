package bejeweled;
import java.util.Set;

import tmge.*;
import tmge.logic.MoveLogic;

public class BejeweledMoveLogic implements MoveLogic {

        @Override
        public Set<Coordinate> getMove(TMGE tmge) throws Exception {
            tmge.getMatrix().print();
            Coordinate c1;
            Coordinate c2;
            
            c1 = tmge.getInputHandler().makeMove();
            c2 = tmge.getInputHandler().makeMove();
            while (!tmge.getMatrix().checkAdjacent(c1, c2)){
                c1 = tmge.getInputHandler().makeMove();
                c2 = tmge.getInputHandler().makeMove();
            }

            return Set.of(c1, c2);
        }

    
}
