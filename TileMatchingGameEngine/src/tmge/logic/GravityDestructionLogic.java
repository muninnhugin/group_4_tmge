package tmge.logic;
import tmge.TileDestructionLogic;
import tmge.TileMatrix;
import java.util.Set;
import tmge.Coordinate;


//1. go through the matrix and if its part of matched set, set to empty 
//2. if there's an empty spot, move all pieces down by one cell (if smth above)
                            // move all pieces to the side by one cell  (if nothing above/if smth next to)

public class GravityDestructionLogic implements TileDestructionLogic {



    public void removeMatch(TileMatrix matrix,  Set<Coordinate> matched)
    {


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



   
    @Override
    public void destroy(TileMatrix board) throws Exception {
        // TODO Auto-generated method stub
        

    }



    
}
