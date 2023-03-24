package bejeweled;
import java.util.Set;

import tmge.*;
import tmge.logic.MoveLogic;

public class BejeweledMoveLogic implements MoveLogic {

        @Override
        public Set<Coordinate> getMove(TMGE tmge) throws Exception {
            System.out.println("Round "+tmge.getTurn());
            tmge.getMatrix().print();
            Coordinate c1;
            Coordinate c2;
            System.out.println("First coordinate: ");
            c1 = tmge.getInputHandler().makeMove();
            System.out.println("Second coordinate: ");
            c2 = tmge.getInputHandler().makeMove();
            while (!tmge.getMatrix().checkAdjacent(c1, c2)){
                System.out.println("Tiles cannot be switched. Try again");
                c1 = tmge.getInputHandler().makeMove();
                c2 = tmge.getInputHandler().makeMove();
            }
            tmge.getMatrix().swapTiles(c1, c2);

            return Set.of(c1, c2);
        }

    
}
