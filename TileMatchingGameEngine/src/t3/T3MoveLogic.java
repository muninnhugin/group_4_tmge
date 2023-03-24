package t3;

import java.util.Set;

import tmge.*;
import tmge.logic.*;

public class T3MoveLogic implements MoveLogic {

    @Override
    public Set<Coordinate> getMove(TMGE tmge) throws Exception {
        tmge.getMatrix().print();
        Coordinate coord;
        do {
            coord = tmge.getInputHandler().makeMove();
        } while (!tmge.getMatrix().getTile(coord).isEmpty());
        VisibleTile tile;
        switch (tmge.getPlayer()) {
            case 0:
                tile = new VisibleTile(VisibleTile.COLORS[0], new Circle());
                tmge.getMatrix().setTile(coord, tile);
                break;
            case 1:
                tile = new VisibleTile(VisibleTile.COLORS[3], new Circle());
                tmge.getMatrix().setTile(coord, tile);
                break;
        }
        return Set.of(coord);
    }
    
}
