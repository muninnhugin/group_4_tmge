package tmge.logic;
import tmge.*;

//1. go through the matrix and if its part of matched set, set to empty 
//2. if there's an empty spot, move all pieces down by one cell (if smth above)
                            // move all pieces to the side by one cell  (if nothing above/if smth next to)

public class GravityDestructionLogic extends DestructionLogic {


    @Override
    public void destroy(TileMatrix tm) throws Exception {
        int temp;
        for (int i = tm.getRow() - 1; i < 0; i-- ){
            for (int j = 0; j < tm.getColumn(); j++){
                if (tm.getBoard()[i][j].getColor() == "empty"){
                    temp = i;
                    while (tm.getBoard()[temp][j].getColor() != "empty"){
                        temp--;
                    }
                    //swap tile between [i][j] and [temp][j]
                    tm.swapTiles(new Coordinate(temp, j), new Coordinate(i, j));
                   
                }
            }
        }

    }


    
}
