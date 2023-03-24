package samegame;
import java.util.Set;

import tmge.*;
import tmge.logic.MoveLogic;

public class SGMoveLogic implements MoveLogic {

    @Override
    public Set<Coordinate> getMove(TMGE tmge) throws Exception {
        System.out.println("      Round "+tmge.getTurn()+"\n");
        tmge.getMatrix().print();
        Coordinate c1;
        System.out.println("Enter coordinate (x y): ");
        c1 = tmge.getInputHandler().makeMove();
        return Set.of(c1);
    }


}
