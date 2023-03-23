package tmge.logic;
import java.util.Set;
import tmge.*;

public abstract class DestructionLogic implements TileDestructionLogic {

    public void removeMatch(TileMatrix matrix,  Set<Coordinate> matched)
    {  
        // Tile[][] board = tmge.getTileMatrix().getBoard();
        // need to change the variables in setEmpty as just board[coord.x][coord.y].
        for (int i = 0; i < matrix.getRow(); i++){
            for (int j = 0; j < matrix.getColumn(); j++){
                Coordinate coord = new Coordinate(i, j);
                if (matched.contains(coord))
                {
                    matrix.setEmpty(coord);
                }
            }
        }
    }
}
